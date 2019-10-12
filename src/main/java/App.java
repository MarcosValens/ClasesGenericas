import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String confirmacion;
        boolean continuar = false;
        Bolsa bolsa = new Bolsa(3);
        System.out.println("Buenos dias, indique que producto desea agregar a la bolsa\n" +
                "Presione 1 para Jamon York\n" +
                "Presione 2 para Lejia\n" +
                "Presione 3 para Barra de pan");
        while (!continuar) {
            System.out.println("indique que producto desea agregar a la bolsa");
            switch (input.nextInt()) {
                case 1:
                    Charcuteria charcuteria = new Charcuteria("Jamon York", 1.70);
                    bolsa.getItem(charcuteria);
                    input.nextLine();
                    bolsa.insertItem(charcuteria);
                    System.out.println("Desea introducir mas objetos");
                    confirmacion = input.nextLine();
                    if (confirmacion.equals("No") || confirmacion.equals("no") || confirmacion.equals("NO") ||
                            confirmacion.equals("N") || confirmacion.equals("n")) {
                        bolsa.showItems();
                        continuar = true;
                    }
                    break;

                case 2:
                    input.nextLine();
                    Drogueria drogueria = new Drogueria("Lejia",2.00);
                    bolsa.insertItem(drogueria);
                    System.out.println("Desea introducir mas objetos");
                    confirmacion = input.nextLine();
                    if (confirmacion.equals("No") || confirmacion.equals("no") || confirmacion.equals("NO") ||
                            confirmacion.equals("N") || confirmacion.equals("n")) {
                        bolsa.showItems();
                        continuar = true;
                    }
                    break;

                case 3:
                    input.nextLine();
                    Panaderia panaderia = new Panaderia("Barra de pan", 0.60);
                    bolsa.insertItem(panaderia);
                    System.out.println("Desea introducir mas objetos");
                    confirmacion = input.nextLine();
                    if (confirmacion.equals("No") || confirmacion.equals("no") || confirmacion.equals("NO") ||
                            confirmacion.equals("N") || confirmacion.equals("n")) {
                        bolsa.showItems();
                        continuar = true;
                    }
                    break;
                default:
                    System.out.println("La opcion elegida no existe");
            }
        }
        System.out.println("¿Deseas eliminar producto de la bolsa?");
        confirmacion = input.nextLine();
        if (confirmacion.equals("Si") || confirmacion.equals("si") || confirmacion.equals("SI") ||
                confirmacion.equals("s") || confirmacion.equals("S")) {
            System.out.println("Que producto deseas eliminar?\n" +
                    "Presione 1 para Jamon York\n" +
                    "Presione 2 para Lejia\n" +
                    "Presione 3 para Barra de pan\n");
            continuar = false;
            while (!continuar) {
                System.out.println("Estos son tus productos:\n");
                bolsa.showItems();
                switch (input.nextInt()) {
                    case 1:
                        input.nextLine();
                        Charcuteria compareClass = new Charcuteria();
                        bolsa.removeItem(bolsa.getItem(compareClass));
                        System.out.println("Desea eliminar mas productos?");
                        confirmacion = input.nextLine();
                        if (confirmacion.equals("No") || confirmacion.equals("no") || confirmacion.equals("NO") ||
                                confirmacion.equals("N") || confirmacion.equals("n")) {
                            bolsa.showItems();
                            continuar = true;
                        }
                        break;
                    case 2:
                        input.nextLine();
                        Drogueria drogueria = new Drogueria();
                        bolsa.removeItem(bolsa.getItem(drogueria));
                        System.out.println("Desea eliminar mas productos?");
                        confirmacion = input.nextLine();
                        if (confirmacion.equals("No") || confirmacion.equals("no") || confirmacion.equals("NO") ||
                                confirmacion.equals("N") || confirmacion.equals("n")) {
                            bolsa.showItems();
                            continuar = true;
                        }
                        break;
                    case 3:
                        input.nextLine();
                        Panaderia panaderia = new Panaderia();
                        bolsa.removeItem(bolsa.getItem(panaderia));
                        System.out.println("Desea eliminar mas productos?");
                        confirmacion = input.nextLine();
                        if (confirmacion.equals("No") || confirmacion.equals("no") || confirmacion.equals("NO") ||
                                confirmacion.equals("N") || confirmacion.equals("n")) {
                            bolsa.showItems();
                            continuar = true;
                        }
                        break;
                    default:
                        System.out.println("La opcion elegida no existe");
                }
            }

        }
    }
}
