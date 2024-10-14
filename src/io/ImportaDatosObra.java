//Nicolas Hobbins y Matias Medina
package io;

import Dominio.*;
import java.util.ArrayList;


public class ImportaDatosObra {
    
    
    public static int importarObra(Sistema s, String nombreArchivo) {
        int devolucion = 0;
        Propietario propietario = null;
        Capataz capataz = null;
        String direccion = null;
        int año = 0;
        int mes = 0;
        String permiso = null;
        int presupuestoTotal = 0;
        ArrayList<Presupuesto> presupuestos = new ArrayList<>();

        ArchivoLectura lector = new ArchivoLectura(nombreArchivo);
        int numLinea = 0;

        while (lector.hayMasLineas()) {
            // Procesar la primera línea
            numLinea++;
            String[] datosObra = lector.linea().split("#");

            if (datosObra.length == 6 && numLinea == 1) {
                if((s.existeCedula(datosObra[1].trim()))&&(s.existeCedula(datosObra[0].trim()))){
                    capataz = s.buscarCapatazCi(datosObra[0].trim());
                    propietario = s.buscarPropietarioCi(datosObra[1].trim());
                    devolucion = 1;
                }
                direccion = datosObra[2].trim();
                mes = Integer.parseInt(datosObra[3].trim());
                año = Integer.parseInt(datosObra[4].trim());
                permiso = datosObra[5].trim();
                if (s.existePermiso(permiso)){
                    devolucion = 2;
                }
                
            } else {
                if ((numLinea >= 3) && (devolucion == 1)) {
                    for (int i = 0; i < datosObra.length; i = i + 2) {
                        if (s.corroborarNombreRubro(datosObra[i])) {
                            s.registrarRubro(datosObra[i], "Descripción a definir");
                            presupuestoTotal += Integer.parseInt(datosObra[i + 1].trim());
                            Presupuesto p = new Presupuesto(s.buscarRubro(datosObra[i]), Integer.parseInt(datosObra[i + 1].trim()));
                            presupuestos.add(p);
                        } else {
                            Rubro rubro = s.buscarRubro(datosObra[i]);
                            rubro.setMonto(Integer.parseInt(datosObra[i + 1]));
                            presupuestoTotal += Integer.parseInt(datosObra[i + 1].trim());
                            Presupuesto p = new Presupuesto(s.buscarRubro(datosObra[i]), Integer.parseInt(datosObra[i + 1].trim()));
                            presupuestos.add(p);
                        }
                    }
                }
            }
        }
        if(devolucion == 1){
            s.registrarObra(propietario, capataz, presupuestos, permiso, direccion, año, mes, presupuestoTotal);
        }
        return devolucion;
    }  
            

}
    
    

