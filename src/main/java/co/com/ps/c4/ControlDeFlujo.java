package co.com.ps.c4;

public class ControlDeFlujo {

    public static void main(String[] args) {
/*
        int numero = 10;

        if (numero==10){
            System.out.println("correcto");
        }else{
            System.out.println("correcto");
        }

        if (numero > 0) {
            System.out.println("el numero es positivo");
        } else if (numero < 0){
            System.out.println("el nummero es negativo");
        }else {
                System.out.println("el numero es cero");
        }

    } */

        String ruta = "home";
        switch (ruta){
            case "amigos":
                System.out.println("www.facebook.com/amigos");
                break;
            case "home":
                System.out.println("www.facebook.com/home");
                break;
            case "marketplace":
                System.out.println("www.facebook.com/marketplace");
                break;

        }

    }
}


