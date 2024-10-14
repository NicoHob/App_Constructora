//Nicolas Hobbins y Matias Medina
package Dominio;
import java.io.Serializable;


public class Presupuesto implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Rubro rubro;
    private int monto;
    
    
    public Presupuesto(){
        rubro = null;
        monto = 0;
    }
    
    public Presupuesto(Rubro unRubro, int unMonto){
        rubro = unRubro;
        monto = unMonto;
    }
    
    public void setRubro(Rubro unRubro){
        rubro = unRubro;
    }
    
    public Rubro getRubro(){
        return rubro;
    }
    
    public void setMonto(int unMonto){
        monto = unMonto;
    }
    
    public int getMonto(){
        return monto;
    }
}
