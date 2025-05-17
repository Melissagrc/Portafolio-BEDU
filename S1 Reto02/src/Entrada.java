public class Entrada {
    String nombreEvento;
    double precio;
    String descripcion;
    String fecha;

    //constructor
    public Entrada(String nombreEvento, double precio, String descripcion, String fecha) {
        this.nombreEvento = nombreEvento;
        this.precio = precio;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
    //metodo para mostrar la informacion de Entrada
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombreEvento + "\nPrecio: $" + precio + "\nDescripcion: " + descripcion + "\nFecha: " + fecha);
    }
}