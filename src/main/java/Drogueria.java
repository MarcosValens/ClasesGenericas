public class Drogueria implements Producto{
    String nombre;
    double precio;

    public Drogueria() {
    }

    public Drogueria(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
