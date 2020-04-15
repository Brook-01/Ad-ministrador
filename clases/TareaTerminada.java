package clases;

public class TareaTerminada extends Tarea {
     private String FechaTerminado;
     public TareaTerminada(String Descripcion, String Fecha, String FechaTerminado){
          super(Descripcion, Fecha);
          this.FechaTerminado = FechaTerminado;
     }//Constructor de la clase hija

}