package clases;

public class Tarea{
     public String Descripcion;
     private String Fecha;
     private EstadosTarea Estado;

     public Tarea(String Descripcion, String Fecha){
          this.Descripcion = Descripcion;
          this.Fecha = Fecha;
          Estado = EstadosTarea.ACTIVO;
     }//Constructor de la clase

     public EstadosTarea getEstado(){
          return Estado;
     }

     public String getDescripcion(){
          return Descripcion;
     }

     public boolean VerificarEstadoActivo() {
          if(Estado == EstadosTarea.ACTIVO) {
               return true;
          }else{
               return false;
          }
     }

     public String toStringTarea(){
          return Descripcion+" -- "+Fecha+" -- "+Estado;
     }
}
