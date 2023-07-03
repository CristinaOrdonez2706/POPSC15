package co.com.ps.c4;

import java.util.ArrayList;
import java.util.List;

public class ArreglosEnJJava {
    public static void main(String[] args) {
    int [] numeros = new int [5];
    List<String> ejemplo = new ArrayList<String>();

    ejemplo.add("Hola");
    ejemplo.add("Estudiantes");

    /*
        numeros[0] = 16;
        numeros[1] = 34;
        numeros[2] = 65;
        numeros[3] = 31;
        numeros[4] = 23;

    System.out.println("Elementos del arreglo numeros:");
    

    for (int i=0; i<numeros.length; i++);
    System.out.print(numeros[0]);
 */

        for (String palabras:ejemplo) {
            System.out.print(palabras);
            
        }       
}
}
