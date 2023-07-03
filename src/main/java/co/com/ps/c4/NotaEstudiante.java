package co.com.ps.c4;

import java.util.*;

public class NotaEstudiante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.next();
        System.out.println("Ingrese la nota del estudiante:");
        int nota = scanner.nextInt();

        if (nota>=3 && nota<=5){
            System.out.println("El estudiante " +nombre+" ganó la asignatura");
        }else if (nota >=0 && nota <=3){
                System.out.println("El estudiante " +nombre+ " perdió la asignatura");
        }else {
            System.out.println("Por favor verificar la nota del estudiante");
            }
    }
}
