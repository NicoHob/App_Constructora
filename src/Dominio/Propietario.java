//Nicolas Hobbins y Matias Medina
package Dominio;
import java.io.Serializable;

public class Propietario extends Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String celular;
    
    public Propietario(){
        super();
        celular = "";
    }
    public Propietario(String nombre, String cedula, String direccion, String unCelular){
        super(nombre,cedula,direccion);
        celular = unCelular;
    }
    
    public void setCelular(String unCelular){
        celular = unCelular;
    }
    public String getCelular(){
        return celular;
    }

}
