//Nicolas Hobbins y Matias Medina
package Dominio;
import java.util.*;
import java.io.Serializable;

public class Obra implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Propietario propietario;
    private Capataz capataz;
    private String permiso;
    private String direccion;
    private int mes;
    private int año;
    private int presupuestoTotal;
    private int gastoTotal;
    private ArrayList<Presupuesto> presupuestos;
    private ArrayList<Gasto> gastos;
    
    public Obra() {
        propietario = null;
        capataz = null;
        permiso = null;
        direccion = "";
        mes = 0;
        año = 0;
        presupuestoTotal = 0;
        gastoTotal = 0;
        presupuestos = new ArrayList<>();
        gastos = new ArrayList<>();
    }
    
    
    public Obra(Propietario unPropietario,Capataz unCapataz,ArrayList<Presupuesto> listaPresupuestos,String unPermiso,String unaDireccion,int unAño,int unMes, int unPresupuesto){
        
        propietario = unPropietario;
        capataz = unCapataz;
        presupuestos = listaPresupuestos;
        permiso = unPermiso;
        direccion = unaDireccion;
        año = unAño;
        mes = unMes;
        presupuestoTotal = unPresupuesto;
        gastos = new ArrayList<>();
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario unPropietario) {
        propietario = unPropietario;
    }

    public Capataz getCapataz() {
        return capataz;
    }

    public void setCapataz(Capataz unCapataz) {
        capataz = unCapataz;
    }
    
    public void setPermiso(String unPermiso){
        permiso = unPermiso;
    }
    
    public String getPermiso(){
        return permiso;
    }
    
    public void setDireccion(String unaDireccion){
        direccion = unaDireccion;
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setMes(int unMes){
        mes = unMes;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setAño(int unAño){
        año = unAño;
    }
    
    public int getAño(){
        return año;
    }
    
    public void setPresupuestoTotal(int unMonto){
        presupuestoTotal += unMonto;
    }
    
    public int getPresupuestoTotal() {
        return presupuestoTotal;
    }
    
    public void setGastoTotal(int unMonto){
        gastoTotal += unMonto;
    }
    
    public int getGastoTotal() {
        return gastoTotal;
    }
    
    public ArrayList<Presupuesto> getPresupuestos(){
        return presupuestos;
    }
    
    public void setPresupuestos(ArrayList<Presupuesto> losPresupuestos) {
        presupuestos = losPresupuestos;
    }

    public ArrayList<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(ArrayList<Gasto> unosGastos) {
        gastos = unosGastos;
    }
    
    //--------------------------------------------------------------------------------
    
    public int totalGastadoIntegrado(){
        int suma = 0;
        for(Gasto g : gastos){
            if(g.getSePago()){
                suma+=g.getMonto();
            }
        }
        return suma;
    }
    
    public int totalGastadoNoIntegrado(){
        int suma = 0;
        for(Gasto g : gastos){
            if(!g.getSePago()){
                suma+=g.getMonto();
            }
        }
        return suma;
    }
    
    //registra el gasto en la obra y devuelve el numero de gasto
    public int agregarGastoYDevolverNumero(Rubro rubro, int monto, int mes, int año, String descripcion){
        Gasto gasto = new Gasto(rubro,monto,mes,año,descripcion);
        gastos.add(gasto);
        gasto.setNumero(gastos.indexOf(gasto)+1);
        gastoTotal += monto;
        return (gastos.indexOf(gasto)+1);
    }
}
