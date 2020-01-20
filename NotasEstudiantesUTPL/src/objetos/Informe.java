package objetos;

import java.util.ArrayList;

/**
 *
 * @author SARANGO
 */
public class Informe {

    private String encabezado;
    private ArrayList<Estudiante> estudiantes;

    public Informe(String encabezado, ArrayList<Estudiante> estudiantes) {
        this.encabezado = encabezado;
        this.estudiantes = estudiantes;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void calcular() {
        for (Estudiante estudiante : estudiantes) {
            estudiante.calcular();
        }
    }

    @Override
    public String toString() {
        String reporte = String.format("%s\n", encabezado);
        for (Estudiante estudiante : estudiantes) {
            reporte += String.format("%s\n", estudiante);
        }
        return reporte;
    }

}
