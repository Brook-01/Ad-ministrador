import clases.EstadosTarea;
import clases.FabricaDeTarea;
import clases.Libreta;
import clases.Mostrador;

public class AdministradorDeTareas{
     public static void main(String args[]){
          Libreta laLibreta = new Libreta();
          FabricaDeTarea Fabrica = new FabricaDeTarea();
          Mostrador LaHoja = new Mostrador();

          laLibreta.AgregarTarea(Fabrica.InstanciarNuevaTarea());//Agregartareas

          LaHoja.MostrarTareasEspecificas(laLibreta, EstadosTarea.ACTIVO);
     }
}