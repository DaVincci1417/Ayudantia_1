import java.util.ArrayList;

public class ListaTareas {
    private ArrayList<Tarea> listaTareas = new ArrayList<>();

    //Agregar una Tarea
    public void agregarTarea(Tarea tarea){
        listaTareas.add(tarea);
    }

    //Encontrar tarea por el nombre.
    public Tarea buscarProductoPorNombre(String nombre){
        int posicion = -1;
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).getNombre() == nombre){
                posicion = i;
            }
        }
        if (posicion != -1) {
            return listaTareas.get(posicion);
        } else {
            return null;
        }
    }

    //Elimar una Tarea
    public void eliminarTareaPorElNombre(String nombreTarea){
        int posicion = -1;
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).getNombre().equals(nombreTarea)) {
                posicion = i;
            }
        }
        if (posicion != -1) {
            System.out.println("El bus ha sido eliminado.");
            listaTareas.remove(posicion);
        } else {
            System.out.println("No se ha encontrado el bus.");
        }
    }

    //Mostrar las tareas existentes
    public void mostrarTareas(){
        for(int i = 0; i < listaTareas.size(); i++){
            System.out.println("Tarea " + (i+1) + ":" + listaTareas.get(i));
        }
    }
}
