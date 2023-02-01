import javax.lang.model.util.ElementScanner14;

public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app
        String saludoGeneral = "Bienvenido al Caf\u00e9 Java, ";
        String mensajePendiente = ", tu pedido estar\u00e1 listo en breve";
        String mensajeListo = ", tu pedido est\u00e1 listo";
        String mensajeMostrarTotal = "Tu total es $";

        // Variables de menú (agrega las tuyas a continuación)
        double precioMocha = 3.5;
        double precioCafeDeFiltro = 4.1;
        double precioCafeConLeche = 4.9;
        double precioCapuchino = 1.8;

        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";

        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = true;
        boolean estaListoOrden3 = false;
        boolean estaListoOrden4 = false;

        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a
        // continuación)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1); // Muestra "Bienvenido a Café Java, Cindhuri"

        // ** Las sentencias print sobre las interacciones con el cliente irán aquí **
        // Simulación 1
        System.out.println(saludoGeneral + cliente1);
        if (estaListoOrden1) {
            System.out.println(cliente1 + mensajeListo);
            System.out.println(mensajeMostrarTotal + precioCafeConLeche + " USD");
        } else {
            System.out.println(cliente1 + mensajePendiente);
        }

        // Simulación 2
        System.out.println(saludoGeneral + cliente2);
        if (estaListoOrden2) {
            System.out.println(cliente2 + mensajeListo);
            System.out.println(mensajeMostrarTotal + precioCapuchino + " USD");
        } else {
            System.out.println(cliente2 + mensajePendiente);
        }

    }
}
