package co.com.ps.c5;

import java.util.Scanner;

public class Login {

    private static final String LOGIN="mmg";
    private static final String CONTRASEMA="1234";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inicioSesionExitoso = false;

        while (!inicioSesionExitoso) {
            System.out.print("Ingrese el nombre de usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Ingrese la contraseña: ");
            String contrasena = scanner.nextLine();

            if (usuario.equals(LOGIN) && contrasena.equals(CONTRASEMA)) {
                System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
                inicioSesionExitoso = true;
            } else {
                System.out.println("Credenciales incorrectas. Intente nuevamente.");
            }
        }



    }



}
