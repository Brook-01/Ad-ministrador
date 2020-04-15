package clases;

import java.util.Scanner;

public class FabricaDeTarea {
     private Scanner Teclado;
     public FabricaDeTarea() {
          Teclado = new Scanner(System.in);
     }//Constructor de la clase
     
     public Tarea InstanciarNuevaTarea(){
          String tarea;
          String fecha;
          System.out.println("Introduce la nueva tarea");
          tarea = EntradaDeTexto();
          System.out.println("Introduce la fecha");
          fecha = EntradaDeTexto();
          Tarea NuevaTarea = new Tarea(tarea, fecha);
          return NuevaTarea;
     }

     public String EntradaDeTexto() {
          String Cadena;
          Cadena = Teclado.nextLine();
          return Cadena;
     }//Metodo para la entrada de cadenas

}