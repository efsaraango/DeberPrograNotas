
package archivo;

import java.util.Comparator;
import objetos.Estudiante;

/**
 *
 * @author SARANGO
 */
/*
*En esta clase vamos a ordenar estudniates por nombre utilizando la clase Comparator utilizando el metodo astracto compare utlizando implements sirve para 
*implementar clases abstractas
*/
public class ComparaPromocion implements Comparator<Estudiante>{
   
    @Override
    public int compare(Estudiante o1, Estudiante o2){
        String a= o1.getPromocion();
        String b= o2.getPromocion();
        return a.compareTo(b);
    }
}
