//Nicolas Hobbins y Matias Medina
package Dominio;
import java.io.Serializable;

public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private String cedula;
    private String direccion;
    
    public Usuario(){
        nombre = "";
        cedula = "";
        direccion = "";
    }
    public Usuario(String unNombre, String unaCedula, String unaDireccion){
        nombre = unNombre;
        cedula = unaCedula;
        direccion = unaDireccion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String unaCedula) {
        cedula = unaCedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String unaDireccion) {
        direccion = unaDireccion;
    }
    
    
    
    
}
