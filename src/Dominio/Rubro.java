//Nicolas Hobbins y Matías Medina
package Dominio;
import java.io.Serializable;

public class Rubro implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private String descripcion;
    private int monto;
    
    public Rubro(){
        nombre = "";
        descripcion = "";
        monto = 0;
    }
    public Rubro(String unNombre, String unaDescripcion) {
        nombre = unNombre;
        descripcion = unaDescripcion;
        monto = 0;
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setDescripcion(String unaDescripcion) { 
        descripcion = unaDescripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int unMonto) {
        monto = unMonto;
    }
    
    
}
