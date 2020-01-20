package informacion;

import java.util.ArrayList;
import java.util.Random;
import objetos.Estudiante;

/**
 *
 * @author SARANGO
 */
public final class Operaciones {

    public static final String NOMBRE = "Estudiante";
    public static final String ENCABEZADO = "Nombre;FOR1;CHA1;VID1;TRA1;PRE1;FRO2;CHA2;VID2;TRA2;PRE2;FIN1;FIN2;TOTAL;ALERTA;PROMOCIÓN";
    public static final double MAXPRE = 14;
    public static final double MAXACTIVIDADES = 1;
    public static final double MAXTRABAJAMOS = 6;

    /*  
    *Metodo para generar valores entre 0 y el numero q le daremos.
     */
    public static double nota(double maxNum) {
        return Math.random() * maxNum;
    }

    /*
    *Metodo en el cual vamos a crear el listado de estudiantes aleatorios
     */
    public static ArrayList<Estudiante> generarEstudiantes(int numEstudiantes) {
        //ArrayList que contiene Estudiantes 
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        for (int i = 0; i < numEstudiantes; i++) {
            //
            estudiantes.add(new Estudiante(String.format("%s%d", NOMBRE, i + 1), nota(MAXACTIVIDADES), nota(MAXACTIVIDADES), nota(MAXACTIVIDADES), nota(MAXTRABAJAMOS), nota(MAXPRE), nota(MAXACTIVIDADES), nota(MAXACTIVIDADES), nota(MAXACTIVIDADES), nota(MAXTRABAJAMOS), nota(MAXPRE)));
        }
        return estudiantes;
    }
/*
    Metodo para combertir un String en numero
    */
    public static double decimal(String numero) {
        double num = 0;
        /*
        *
        */
        numero = numero.replace(",", ".");
        try {
            num = Double.parseDouble(numero);
        } catch (NumberFormatException e) {
            System.out.println("Error al combertir decimal");
        }
        return num;
    }
}
