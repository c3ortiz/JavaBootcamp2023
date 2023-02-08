public class TestPedidos {
    public static void main(String[] args) {

        // Elementos del menú
        Articulo articulo1 = new Articulo();
        Articulo articulo2 = new Articulo();
        Articulo articulo3 = new Articulo();
        Articulo articulo4 = new Articulo();

        articulo1.nombre = "Moka";
        articulo1.precio = 1.1;
        articulo2.nombre = "Latte";
        articulo2.precio = 1.2;
        articulo3.nombre = "Cafe de goteo";
        articulo3.precio = 1.3;
        articulo4.nombre = "Capuchino";
        articulo4.precio = 1.4;

        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido();
        Pedido pedido4 = new Pedido();

        pedido1.nombre = "Cindhuri";
        pedido2.nombre = "Jimmy";
        pedido3.nombre = "Noah";
        pedido4.nombre = "Sam";

        System.out.println(pedido1);
        System.out.println(pedido1.total);

        pedido2.items.add(articulo1);
        pedido2.total += articulo1.precio;

        pedido3.items.add(articulo4);
        pedido3.total += articulo4.precio;

        pedido4.items.add(articulo2);
        pedido4.total += articulo2.precio;

        pedido1.listo = !pedido1.listo;

        pedido4.items.add(articulo2);
        pedido4.items.add(articulo2);
        pedido4.total += articulo2.precio;
        pedido4.total += articulo2.precio;

        pedido2.listo = !pedido2.listo;

        // Ordenar variables -- orden1, orden2, etc.

        // Simulaciones de aplicaciones
        // Utiliza este código de ejemplo para probar las actualizaciones de varios
        // pedidos
        System.out.printf("Nombre: %s\n", pedido4.nombre);
        System.out.printf("Total: %s\n", pedido4.total);
        System.out.printf("Listo: %s\n", pedido4.listo);

        System.out.println(pedido4.items);
    }
}
