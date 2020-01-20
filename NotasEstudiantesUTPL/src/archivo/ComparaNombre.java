
package archivo;

import java.util.Comparator;
import objetos.Estudiante;

/**
 *
 * @author SARANGO
 */
/*
*En esta clase vamos a ordenar Estudiantes por nombre utilizando la clase compare mediante el metodo astracto compare 
*/
public class ComparaNombre implements Comparator<Estudiante>{
   /*
    *
    */
    @Override
    public int compare(Estudiante o1, Estudiante o2){
        String a= o1.getNombre();
        String b= o2.getNombre();
        return a.compareTo(b);
    }
}
