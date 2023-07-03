package co.com.ps.proyectofinal;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la función calculadora");

        while (true){
            System.out.println("Ingrese su primer número:");
            double numero1 = scanner.nextDouble();
            System.out.println("Ingrese su segundo número:");
            double numero2 = scanner.nextDouble();

            System.out.println("Seleccione la operación que desea ejecutar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. Divisióm");
            System.out.println("5. Potencia");
            System.out.println("6. Salir de la calculadora");

            int opcion = scanner.nextInt();
            double resultado = 0;
            boolean esOperacionValida = true;

            switch (opcion) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if
                    (numero2 !=0){
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("No es posible dividir entre 0");
                        esOperacionValida = false;
                    }
                    break;
                case 5:
                    resultado = Math.pow(numero1,numero2);
                    break;
                case 0:
                    System.out.println("Regrese pronto");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    esOperacionValida = false;
                    break;
            }
            if (esOperacionValida) {
                System.out.println("El resultado de su operación es: " +resultado);
            }
        }
    }
}
