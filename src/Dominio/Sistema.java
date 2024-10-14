//Nicolas Hobbins y Matias Medina
package Dominio;

import java.util.*;
import java.io.Serializable;

public class Sistema extends Observable implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private ArrayList<Rubro> listaRubros;
    private ArrayList<Obra> listaObras;
    private ArrayList<Propietario> listaPropietarios;
    private ArrayList<Capataz> listaCapataces;
    private ArrayList<Presupuesto> listaPresupuestos;
    private ArrayList<Gasto> listaGastos; 

    public Sistema(){
        listaRubros = new ArrayList<>();
        listaObras = new ArrayList<>();
        listaPropietarios = new ArrayList<>();
        listaCapataces = new ArrayList<>();
        listaPresupuestos = new ArrayList<>();
        listaGastos = new ArrayList<>();
    }

    public ArrayList<Rubro> getListaRubros() {
        return listaRubros;
    }

    public void setListaRubros(ArrayList<Rubro> laListaRubros) {
        listaRubros = laListaRubros;
        setChanged();
        notifyObservers();
    }

    public ArrayList<Obra> getListaObras() {
        return listaObras;
    }

    public void setListaObras(ArrayList<Obra> laListaObras) {
        listaObras = laListaObras;
        setChanged();
        notifyObservers();
    }

    public ArrayList<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(ArrayList<Propietario> laListaPropietarios) {
        listaPropietarios = laListaPropietarios;
        setChanged();
        notifyObservers();
    }

    public ArrayList<Capataz> getListaCapataces() {
        return listaCapataces;
    }

    public void setListaCapataces(ArrayList<Capataz> laListaCapataces) {
        listaCapataces = laListaCapataces;
        setChanged();
        notifyObservers();
    }

    public ArrayList<Presupuesto> getListaPresupuestos() {
        return listaPresupuestos;
    }

    public void setListaPresupuestos(ArrayList<Presupuesto> unaListaPresupuestos) {
        listaPresupuestos = unaListaPresupuestos;
        setChanged();
        notifyObservers();
    }

    public ArrayList<Gasto> getListaGastos() {
        return listaGastos;
    }

    public void setListaGastos(ArrayList<Gasto> unaListaGastos) {
        listaGastos = unaListaGastos;
        setChanged();
        notifyObservers();
    }
    
    
    
    //-------------------------------------ELIMINACIONES-------------------------------------------
    
    public void eliminarGasto(Gasto g, Obra o) {
        o.getGastos().remove(g);
    }
    
    //------------------------------AGREGACIONES Y REGISTROS---------------------------------------
    
    public void registrarRubro(String nombre, String descripcion){
        Rubro r = new Rubro(nombre,descripcion);
        listaRubros.add(r);
    }
    
    public void registrarCapataz(String nombre, String cedula, String direccion, int añoIngreso) {
        Capataz c = new Capataz(nombre, cedula, direccion, añoIngreso);
        listaCapataces.add(c);
    }
    
    public void registrarPropietario(String nombre, String cedula, String direccion, String celular) {
        Propietario p = new Propietario(nombre, cedula, direccion, celular);
        listaPropietarios.add(p);
    }
    
    public void registrarObra(Propietario propietario,Capataz capataz,ArrayList<Presupuesto> presupuestos,String permiso,String direccion,int año,int mes, int presupuestoTotal){
        Obra o = new Obra(propietario, capataz, presupuestos, permiso, direccion, año, mes, presupuestoTotal);
        listaObras.add(o);
    }
    
    public void registrarPresupuesto(Rubro rubro, int monto){
        Presupuesto p = new Presupuesto(rubro,monto);
        listaPresupuestos.add(p);
        setChanged();
        notifyObservers();
    }
    
    //---------------------------------------CORROBORACIONES---------------------------------------
    
    public boolean corroborarDatosComunes(String nombre, String cedula, String direccion){
        Boolean retorno = true;
        if (nombre.equals("") || cedula.equals("") || direccion.equals("")){
            retorno = false;
        }
        else if ((!nombre.matches("[a-zA-Z\\s]+")||(!esNumero(cedula)))){
            retorno = false;
        }
        else if (existeCedula(cedula)){
            retorno = false;
        }
        return retorno;
    }
    
    public boolean corroborarDatosCapataz(String nombre, String cedula, String direccion, String añoIngreso) {
        boolean retorno = true;
        //verificar datos y fecha(mes 5 para que no afecte al resultado)
        if ((!corroborarDatosComunes(nombre,cedula,direccion))||(!esNumero(añoIngreso))||corroborarFecha(Integer.parseInt(añoIngreso),5)) {
            retorno = false;
        }
        return retorno;
    }
    
    public boolean corroborarDatosPropietario(String nombre, String cedula, String direccion, String celular) {
        Boolean retorno = true;
        //telefono de contacto correcto
        if ((!corroborarDatosComunes(nombre,cedula,direccion))||celular.equals("")||!esNumero(celular)) {
            retorno = false;
        }
        return retorno;
    }
    
    public boolean corroborarDatosObra(Propietario propietario,Capataz capataz,ArrayList<Presupuesto> presupuestos,String permiso,String direccion,int año,int mes){
        boolean retorno = true;
        if((propietario==null)||(capataz==null)||(presupuestos.isEmpty())||(permiso.equals(""))||(direccion.equals(""))||(corroborarFecha(año,mes))){
            retorno = false;
        }
        else{ 
            if((!esNumero(permiso))||(existePermiso(permiso))){
                retorno = false;
            }
        }
        return retorno;
    }
    
    public boolean corroborarDatosGasto(String monto,int mes,int año,String descripcion){
        boolean retorno = true;
        if((corroborarFecha(año,mes))||monto.equals("")||(!esNumero(monto))){
            retorno = false;
        }
        return retorno;
    }
    
    //verifica que no exista previamente el rubro
    public boolean corroborarNombreRubro(String nombre){
        boolean retorno = false;
        if(!nombre.equals("")&&!existeNombre(nombre)){
            retorno=true;
        }
        return retorno;
    }
    
    //verificar que la fecha no sea cero o negativo ni mayor a la fecha actual
    public boolean corroborarFecha(int año,int mes){
        boolean retorno = false;
        if((año > Calendar.getInstance().get(Calendar.YEAR))||(año<1)||(mes>12)||(mes<1)){
            retorno = true;
        }
        return retorno;
    }
    
    //verifica que no exista previamente la cedula
    public boolean existeCedula(String cedulaBuscada) {
        boolean retorno = false;
        for (Capataz capataz : listaCapataces) {
            if (capataz.getCedula().equals(cedulaBuscada)) {
                retorno = true;
            }
        }
        if (!retorno){
            for (Propietario propietario : listaPropietarios) {
                if (propietario.getCedula().equals(cedulaBuscada)) {
                    retorno = true;
                }
            }
        }
        return retorno;
    }
    
    public boolean existeNombre(String nombreBuscado) {
        boolean retorno = false;
        for (Rubro rubro : listaRubros) {
            if (rubro.getNombre().equals(nombreBuscado)) {
                retorno = true;
            }
        }
        return retorno;
    }
    
    public boolean existePermiso(String permisoBuscado) {
        boolean retorno = false;
        for (Obra obra : listaObras) {
            if (obra.getPermiso().equals(permisoBuscado)) {
                retorno = true;
            }
        }
        return retorno;
    }
    
    public boolean esNumero(String dato){
        return dato.matches("\\d+");
    }
    
    //---------------------------------------BUSQUEDAS---------------------------------------
    
    public Rubro buscarRubro(String nombre) {
        Rubro rubro = new Rubro();
        for (Rubro r: listaRubros){
            if (r.getNombre().equals(nombre)){
                rubro = r;
            }
        }
        return rubro;
    }
    
    public Propietario buscarPropietario(String nombre) {
        Propietario propietario = new Propietario();
        for (Propietario p: listaPropietarios){
            if (p.getNombre().equals(nombre)){
                propietario = p;
            }
        }
        return propietario;
    }
    public Capataz buscarCapataz(String nombre) {
        Capataz capataz = new Capataz();
        for (Capataz c: listaCapataces){
            if (c.getNombre().equals(nombre)){
                capataz = c;
            }
        }
        return capataz;
    }
    
    public Propietario buscarPropietarioCi (String ci) {
        Propietario propietario = new Propietario();
        for (Propietario p: listaPropietarios){
            if (p.getCedula().equals(ci)){
                propietario = p;
            }
        }
        return propietario;
    }
    
    public Capataz buscarCapatazCi(String ci) {
        Capataz capataz = new Capataz();
        for (Capataz c: listaCapataces){
            if (c.getCedula().equals(ci)){
                capataz = c;
            }
        }
        return capataz;
    }
    public Obra buscarObra(String permiso) {
//        Obra obra = new Obra();
        for (Obra o: listaObras){
            if (o.getPermiso().equals(permiso)){
                return o;
//                obra = o;
            }
        }
        return null;
//        return obra;
    }
    
    public Gasto buscarGasto(String rubro, Obra obra){
        Gasto gas = new Gasto();
        ArrayList<Gasto> gastos = obra.getGastos();
        for (Gasto g: gastos){
            if (g.getRubro().getNombre().equals(rubro)){
                gas = g;
            }
        }
        return gas;
    }
    
    //-----------------------------------ORDENACIONES----------------------------------------- 
    
    public ArrayList<Propietario> ordenarPropietariosPorNombre(){
        ArrayList<Propietario> propietariosOrdenados = new ArrayList<>(listaPropietarios);

        // Ordenar la nueva lista por nombre
        Collections.sort(propietariosOrdenados, (p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        return propietariosOrdenados;
    }
    
    public ArrayList<Capataz> ordenarCapatacesPorNombre(){
        ArrayList<Capataz> capatacesOrdenados = new ArrayList<>(listaCapataces);

        // Ordenar la nueva lista por nombre
        Collections.sort(capatacesOrdenados, (c1, c2) -> c1.getNombre().compareTo(c2.getNombre()));
        return capatacesOrdenados;
    }
    
    public ArrayList<Propietario> ordenarPropietariosPorCedula(){
        ArrayList<Propietario> propietariosOrdenados = new ArrayList<>(listaPropietarios);

        // Ordenar la nueva lista por cedula
        Collections.sort(propietariosOrdenados, (p1, p2) -> p1.getCedula().compareTo(p2.getCedula()));
        return propietariosOrdenados;
    }
    
    public ArrayList<Capataz> ordenarCapatacesPorCedula(){
        ArrayList<Capataz> capatacesOrdenados = new ArrayList<>(listaCapataces);

        // Ordenar la nueva lista por cedula
        Collections.sort(capatacesOrdenados, (c1, c2) -> c1.getCedula().compareTo(c2.getCedula()));
        return capatacesOrdenados;
    }
    
    //---------------------------------------OTROS---------------------------------------   
    
    public void resetearMontosRubros(){
        for (Rubro r: listaRubros){
            r.setMonto(0);
        }
    }
    
    public int devolverPresupuestoTotal(){
        int suma = 0;
        for (Rubro r: listaRubros){
            suma+= r.getMonto();
        }
        return suma;
    }
    
    public <T> ArrayList<T> removerDuplicados(ArrayList<T> list) {
        // uso un HashSet para eliminar duplicados
        Set<T> set = new HashSet<>(list);
        // convierto de nuevo a ArrayList
        return new ArrayList<>(set);
    }
    
    public boolean estaPresupuesto(String rubro, Obra obra){
        boolean retorno = false;
        for (Presupuesto p: obra.getPresupuestos()){
            if (p.getRubro().getNombre().equals(rubro)){
                retorno = true;
            }
        }
        return retorno;
    }
    
    
}

