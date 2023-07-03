package co.com.ps.c3;

import java.util.*;
public class Clase3 {

    public static void main(String[] args) {

      Persona persona = new Persona();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite su nombre:");
      String nombre = scanner.nextLine();

      System.out.println("Digite su edad:");
      int edad = scanner.nextInt();

      System.out.println("Su nombre es: "+nombre+ " y su edad es: " +edad+ " Bienvenido");

}
}