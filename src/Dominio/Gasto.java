//Nicolas Hobbins y Matias Medina
package Dominio;
import java.io.Serializable;

public class Gasto implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String numero;
    private Rubro rubro;
    private int monto;
    private int año;
    private int mes;
    private String descripcion;
    private boolean sePago;
    private boolean estabaPresupuestado;

    public Gasto() {
        numero = "";
        rubro = null;
        monto = 0;
        mes = 0;
        año = 0;
        descripcion = "";
        sePago = false;
        estabaPresupuestado = false;
    }
    
    public Gasto(Rubro unRubro, int unMonto, int unMes, int unAño, String unaDescripcion) {
        rubro = unRubro;
        monto = unMonto;
        mes = unMes;
        año = unAño;
        descripcion = unaDescripcion;
        sePago = false;
        estabaPresupuestado = false;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(int unNumero){
        numero = "No."+unNumero;
    }
    
    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro unRubro) {
        rubro = unRubro;
    }
    
    public int getMonto() {
        return monto;
    }

    public void setMonto(int unMonto) {
        monto = unMonto;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int unMes) {
        mes = unMes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int unAño) {
        año = unAño;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String unaDescripcion) {
        descripcion = unaDescripcion;
    }
    
    public boolean getSePago(){
        return sePago;
    }
    
    public void setSePago(boolean unSePago){
        sePago = unSePago;
    }

    public boolean getEstabaPresupuestado() {
        return estabaPresupuestado;
    }

    public void setEstabaPresupuestado(boolean unEstabaPresupuestado) {
        estabaPresupuestado = unEstabaPresupuestado;
    }
    
}
