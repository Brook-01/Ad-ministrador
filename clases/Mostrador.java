package clases;

public class Mostrador{

	public void MostrarTareasEspecificas(Libreta laLibreta, EstadosTarea Estado) {
          for(Tarea unadelastareas:laLibreta.getListaDeTareas()){
               if(unadelastareas!=null){
                    MostrarTarea(unadelastareas, Estado);
               }
          }
     }
     
     public void MostrarTarea(Tarea unadelastareas, EstadosTarea Estado){
          if(unadelastareas.getEstado() == Estado){
               System.out.println(unadelastareas.toStringTarea());
          }
     }

}