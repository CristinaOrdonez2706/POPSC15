package co.com.ps.c3;

public class Persona {

   private String nombre;
   private int edad;
   private String estatura;
   private String id;
   private String orientacionsexual;

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }
   public Persona() {

   }
   public Persona(String nombre) {
   this.nombre=nombre;

   }


}
