import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
    private ArrayList<T> items = new ArrayList<T>();
    private int size;
    private int counter = 0;

    public Bolsa(int size) {
        this.size = size;
    }

    public void insertItem(T item) {
        if (counter < size) {
            items.add(item);
            counter++;
        } else System.out.println("no caben mas objetos en la bolsa");
    }

    public void removeItem(T item) {
        if (items.contains(item)) {
            items.remove(item);
        }  else System.out.println("Este producto no esta en la bolsa");

    }


    public void showItems() {
        for (int i = 0; i < items.size(); i++) {
            Producto producto = (Producto) items.get(i);
            System.out.println(producto.getNombre() + " PRECIO: " + producto.getPrecio());
        }
    }

    public Producto getItem(Producto item) {
        String itemClass = item.getClass().toString();
        if (itemClass.equals("class Charcuteria")){
            for (T itemReturn : items) {
                if (itemReturn.getClass().toString().equals(itemClass)) {
                    return (Charcuteria) itemReturn;
                }
            }
        } else if (itemClass.equals("class Drogueria")){
            for (T itemReturn : items) {
                if (itemReturn.getClass().toString().equals(itemClass)) {
                    return (Drogueria) itemReturn;
                }
            }
        } else if (itemClass.equals("class Panaderia")){
            for (T itemReturn : items) {
                if (itemReturn.getClass().toString().equals(itemClass)) {
                    return (Panaderia) itemReturn;
                }
            }
        }
        return null;
    }
}
