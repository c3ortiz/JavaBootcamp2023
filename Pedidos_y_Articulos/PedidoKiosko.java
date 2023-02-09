import java.util.ArrayList;

public class PedidoKiosko {
    private ArrayList<Articulo> menu;
    private ArrayList<Pedido> pedidos;

    public PedidoKiosko() {
        this.menu = new ArrayList<Articulo>();
        this.pedidos = new ArrayList<Pedido>();
    }

    // public void addArticulo(Articulo articulo) {
    // articulos.add(articulo);
    // }

    public void addMenuItem(String nombre, double precio) {
        Articulo articulo1 = new Articulo(nombre, precio);
        menu.add(articulo1);
        articulo1.setIndex(menu.indexOf(articulo1));
    }

    public void displayMenu() {
        for (Articulo i : this.menu)
            System.out.println(i.getIndex() + " " + i.getNombre() + " -- $" + i.getPrecio());
    }

    public void newOrder() {
        Pedido pedido1 = new Pedido();

        System.out.println("Ingrese el nombre del cliente para el nuevo pedido:");
        String name = System.console().readLine();

        String itemNumber = "1";
        while (!itemNumber.equals("q")) {
            displayMenu();
            System.out.println("Ingrese un indice de articulo del menu o q para salir:");
            itemNumber = System.console().readLine();
            if (!itemNumber.equals("q")) {
                int formattedNumber = Integer.parseInt(itemNumber);
                pedido1.addArticulo(menu.get(formattedNumber));
            } else {
                break;
            }
        }

        pedido1.display(name);

    }

    public void addMenuItemByInput() {
        System.out.println("Ingrese el nombre del articulo:");
        String nombre = System.console().readLine();
        System.out.println("Ingrese el precio del articulo:");
        String precioString = System.console().readLine();

        double precio = Double.parseDouble(precioString);

        Articulo articulo1 = new Articulo(nombre, precio);
        menu.add(articulo1);
        articulo1.setIndex(menu.indexOf(articulo1));
    }

}
