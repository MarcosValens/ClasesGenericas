import java.util.ArrayList;

public class Bolsa<T> {
    private ArrayList<T> items = new ArrayList<T>();
    private int size;
    private int counter = 0;

    public Bolsa(int size) {
        this.size = size;
    }

    public void insertItem(T item) {
        if (counter <= size) {
            items.add(item);
            counter++;
        } else System.out.println("no caben mas objetos en la bolsa");
    }

    ;

    public void removeItem(T item) {
        if (items.contains(item)) {
            items.remove(item);
        } else System.out.println("Este objeto no esta en la bolsa");
    }
}
