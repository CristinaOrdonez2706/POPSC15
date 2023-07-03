package co.com.ps.c5;
import java.util.Scanner;
public class PromedioClase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEstudiantes = 5;
        double[] notas = new double[numEstudiantes];


        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedio = (double) suma / numEstudiantes;

        System.out.println("El promedio de las notas es: " + promedio);
    }
}



