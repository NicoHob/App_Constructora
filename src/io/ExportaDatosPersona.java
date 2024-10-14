//Nicolas Hobbins y Matias Medina
package io;

import Dominio.*;

public class ExportaDatosPersona {

   
    public static void exportarPorNombre(Sistema s){
        ArchivoGrabacion agP = new ArchivoGrabacion("Personas.txt", false);
        agP.grabarLinea("Propietarios\n");
        for (Propietario p: s.ordenarPropietariosPorNombre()){
            agP.grabarLinea("\t" + p.getNombre() + ";" + p.getCedula() + ";" + p.getDireccion() + ";" + p.getCelular());
        }
        agP.grabarLinea("\n\n\nCapataces\n");
        
        for (Capataz e: s.ordenarCapatacesPorNombre()){
            agP.grabarLinea("\t" +e.getNombre() + ";" + e.getCedula() + ";" + e.getDireccion() + ";" + e.getAñoIngreso());
        }
        agP.cerrar();
    }
    
    public static void exportarPorCedula(Sistema s){
        ArchivoGrabacion agP = new ArchivoGrabacion("Personas.txt", false);
        agP.grabarLinea("Propietarios\n");
        for (Propietario p: s.ordenarPropietariosPorCedula()){
            agP.grabarLinea("\t" + p.getNombre() + ";" + p.getCedula() + ";" + p.getDireccion() + ";" + p.getCelular());
        }
        agP.grabarLinea("\n\n\nCapataces\n");
        
        for (Capataz e: s.ordenarCapatacesPorCedula()){
            agP.grabarLinea("\t" +e.getNombre() + ";" + e.getCedula() + ";" + e.getDireccion() + ";" + e.getAñoIngreso());
        }
        agP.cerrar();
    }

}
