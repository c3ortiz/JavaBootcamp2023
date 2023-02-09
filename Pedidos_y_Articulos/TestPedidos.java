public class TestPedidos {
    public static void main(String[] args) {

        // Elementos del menú
        Articulo articulo1 = new Articulo("Moka", 1.1);
        Articulo articulo2 = new Articulo("Latte", 1.2);
        Articulo articulo3 = new Articulo("Cafe de goteo", 1.3);
        Articulo articulo4 = new Articulo("Capuchino", 1.4);

        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();

        Pedido pedido3 = new Pedido("Pepa");
        Pedido pedido4 = new Pedido("Pepe");
        Pedido pedido5 = new Pedido("Pepi");

        pedido1.addArticulo(articulo1);
        pedido1.addArticulo(articulo2);

        pedido2.addArticulo(articulo3);
        pedido2.addArticulo(articulo4);

        pedido3.addArticulo(articulo1);
        pedido3.addArticulo(articulo3);

        pedido4.addArticulo(articulo2);
        pedido4.addArticulo(articulo4);

        pedido5.addArticulo(articulo1);
        pedido5.addArticulo(articulo4);

        pedido1.setListo(true);
        pedido2.setListo(true);
        pedido5.setListo(true);

        pedido1.display("Pepa");
        pedido2.display("Pepa");
        pedido3.display("Pepa");
        pedido4.display("Pepa");
        pedido5.display("Pepa");

        System.out.println("-------- Inicio PedidosKiosko -------");

        PedidoKiosko pedidoKiosko = new PedidoKiosko();
        pedidoKiosko.addMenuItem("banana", 1600);
        pedidoKiosko.addMenuItem("cafe", 1200);
        pedidoKiosko.addMenuItem("latte", 3600);
        pedidoKiosko.addMenuItem("capuchino", 2400);
        pedidoKiosko.addMenuItem("muffin", 3200);
        pedidoKiosko.displayMenu();

        pedidoKiosko.newOrder();

        pedidoKiosko.addMenuItemByInput();
        pedidoKiosko.displayMenu();

    }
}
