package notasestudiantesutpl;

import archivo.ComparaNombre;
import archivo.ComparaPromocion;
import archivo.ComparaTotal;
import informacion.Operaciones;
import java.util.ArrayList;
import objetos.Estudiante;
import objetos.Informe;
import archivo.EscribirArchivo;
import archivo.LecturaArchivo;
import java.util.Collections;

/**
 *
 * @author SARANGO
 */
public class NotasEstudiantesUTPL {

    public static void main(String[] args) {
        String[] archivo = {"usernameBdEst_OrdenNomb.csv", "usernameBdEst_OrdenTOTAL.csv", "usernameBdEst_OrdenPromo.csv"};

        ArrayList<Estudiante> estudiantes = Operaciones.generarEstudiantes(10);
        Informe informe1 = new Informe(Operaciones.ENCABEZADO, estudiantes);

        EscribirArchivo archivoSalida = new EscribirArchivo("datos.csv");
        archivoSalida.escribir(informe1.toString());
        archivoSalida.cerrar();

        LecturaArchivo entrada = new LecturaArchivo("datos.csv");
        estudiantes = entrada.obtenerEstudiante();
        
        informe1 = new Informe(Operaciones.ENCABEZADO, estudiantes);
        informe1.calcular();
        /*
        *Guardamos el los datos en erchivos csv.
         */

        archivoSalida = new EscribirArchivo("usernameBdEst_OrdenNomb.csv");
        archivoSalida.escribir(informe1.toString());
        archivoSalida.cerrar();

        Collections.sort(estudiantes, new ComparaTotal());
        archivoSalida = new EscribirArchivo("usernameBdEst_OrdenTOTAL.csv");
        archivoSalida.escribir(informe1.toString());
        archivoSalida.cerrar();

        Collections.sort(estudiantes, new ComparaPromocion());
        archivoSalida = new EscribirArchivo("usernameBdEst_OrdenPromo.csv");
        archivoSalida.escribir(informe1.toString());
        archivoSalida.cerrar();

    }

}
