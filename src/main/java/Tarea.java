public class Tarea {
    private String nombre;
    private String descripcion;
    public Tarea(String nombre, String descripcion){
        setNombre(nombre);
        setDescripcion(descripcion);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    //Setters
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "Tarea{" +
                "Nombre: " + nombre + '\n' +
                "Descripcion: " + descripcion +
                '}';
    }
}
