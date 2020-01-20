package archivo;

import java.util.Formatter;

/**
 *
 * @author SARANGO
 */
public class EscribirArchivo {

    private Formatter archivo;

    public EscribirArchivo(String archivo) {
        try {
            this.archivo = new Formatter(archivo, "UTF-8");

        } catch (Exception e) {
            System.out.println("Error al abrir el archivo");

        }
    }
    /*
    *Este metodo escribe en el archivo se escribe el archivo q se pasa como parameto 
    */
    public void escribir(String linea) {
        archivo.format("%s\n", linea);

    }

    public void cerrar() {
        archivo.close();
    }
}
