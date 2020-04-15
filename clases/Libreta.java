package clases;

public class Libreta {
     private Tarea[] ListaDeTareas;
     public Libreta(){
          ListaDeTareas = new Tarea[5];
          for(Tarea espacio : ListaDeTareas) {
               espacio = null;
          }
     }//Constructor para crear un arreglo de objetos tipo "Tarea"

     public boolean VerificarVacio(){
          for(Tarea Lugar : ListaDeTareas) {
               if(Lugar != null){
                    return false;
               }
          }
          return true;
     }//Metodo para verificar si el arreglo esta vacio

     public boolean VerificarLlenado(){
          for(Tarea Lugar : ListaDeTareas) {
               if(Lugar == null){
                    return false; 
               }
          }
          return true;
     }//Metodo para verificar si el arreglo esta lleno

     public Tarea[] getListaDeTareas(){
          return ListaDeTareas;
     }//Metodo para obtener el arreglo de tareas

     public byte IndiceVacio(){
          byte indice = 0;
          for(Tarea Lugar: ListaDeTareas){
               if(Lugar==null){
                    return indice;
               }else{
                    indice++;
               }
          }
          return -1;//Esto de aqui en teoria, NUNCA, deveria de retornarce
     }//Metodo para encontrar un indeice vacio en el arreglo de tareas

     public void AgregarTarea(Tarea _Tarea){
          ListaDeTareas[IndiceVacio()] = _Tarea;
     }//Metodo para agregar una tarea
     
     
}
