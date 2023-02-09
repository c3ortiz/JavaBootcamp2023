import java.util.ArrayList;

public class Pedido {
    private String nombre;
    private boolean listo;
    ArrayList<Articulo> articulos = new ArrayList<Articulo>();

    public Pedido() {
        this.nombre = "invitado";
        ArrayList<Articulo> articulos = new ArrayList<Articulo>(0);
    }

    public Pedido(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isListo() {
        return listo;
    }

    public void setListo(boolean listo) {
        this.listo = listo;
    }

    public void addArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public String getStatusMessage() {
        return listo ? "Tu pedido está listo" : "Gracias por esperar. Tu pedido estará listo pronto";
    }

    public void display(String name) {
        System.out.println("Nombre cliente: " + name);

        for (int i = 0; i < articulos.size(); i++) {
            System.out.println(articulos.get(i).getNombre() + " -- $" + articulos.get(i).getPrecio());
        }

        System.out.println(getOrderTotal());
        // System.out.println(getStatusMessage());

    }

    public String getOrderTotal() {
        double totalOrden = 0;

        for (int i = 0; i < articulos.size(); i++) {
            totalOrden += articulos.get(i).getPrecio();
        }

        return "Total: $" + totalOrden;
    }
}
