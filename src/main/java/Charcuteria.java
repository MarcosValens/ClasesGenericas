public class Charcuteria implements Producto{
    String nombre;
    double precio;

    public Charcuteria() {
    }

    public Charcuteria(String nombre, double precio) {
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
