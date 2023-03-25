import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ventana {
    public void interaccion(){
        ListaTareas listaTareas = new ListaTareas();
        Scanner leer = new Scanner(System.in);
        int opc = -1;
        do{
            menu();
            opc = leer.nextInt();
            seleccion(opc, listaTareas);
        }while (opc !=0);
        System.out.println("Ha Salido.");
        System.exit(0);
    }

    private void menu(){
        System.out.println(
                "0. Salir." + "\n" +
                        "1. Agregar Tarea." + "\n" +
                        "2. Mostrar Tareas Existentes." + "\n" +
                        "3. Eliminar Tarea" + "\n"
        );
    }
    private void seleccion(int opc,ListaTareas listaTareas){
        switch (opc){
            case 0:
                break;
            case 1:
                interaccionAgregarTarea(listaTareas);
                break;
            case 2:
                mostrarTareas(listaTareas);
                break;
            case 3:
                interaccionEliminarTarea(listaTareas);
                break;
        }
    }
    private void interaccionAgregarTarea(ListaTareas listaTareas){
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        String descripcion = "";
        System.out.println("Ingrese el nombre de la tarea.");
        nombre = leer.nextLine();
        System.out.println("Ingrese una descripcion de la tarea.");
        descripcion = leer.nextLine();
        listaTareas.agregarTarea(new Tarea(nombre, descripcion));
        System.out.println("Se ha guardado la tarea.");
    }

    private void mostrarTareas(ListaTareas listaTareas){
        listaTareas.mostrarTareas();
    }

    private void interaccionEliminarTarea(ListaTareas listaTareas){
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        String descripcion = "";
        String urgencia = "";
        System.out.println("Ingrese el nombre de la tarea que desea eliminar.");
        nombre = leer.nextLine();
        listaTareas.eliminarTareaPorElNombre(nombre);
    }
}
