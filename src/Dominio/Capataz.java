//Nicolas Hobbins y Matías Medina
package Dominio;
import java.io.Serializable;

public class Capataz extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private int añoIngreso;
    
    public Capataz(){
        super();
        añoIngreso = 0;
    }
    public Capataz(String nombre, String cedula, String direccion,int unAñoIngreso) {
        super(nombre,cedula,direccion);
        añoIngreso = unAñoIngreso;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int unAñoIngreso) {
        añoIngreso = unAñoIngreso;
    }
   
}
