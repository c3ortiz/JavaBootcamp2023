import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil();
        int numWeeks = 10;

        /* ============ Casos de prueba de la App ============= */

        System.out.println("\n----- Prueba Meta caf\u00e9 -----");
        System.out.printf("Compras necesarias para la semana %s: %s \n\n", numWeeks, appTest.getStreakGoal(numWeeks));

        System.out.println("----- Prueba Total Orden -----");
        double[] lineItems = { 3.5, 1.5, 4.0, 4.5 };
        System.out.printf("Total orden: %s \n\n", appTest.getOrderTotal(lineItems));

        System.out.println("----- Prueba Mostrar Men\u00fa -----");

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Caf\u00e9 de goteo");
        menu.add("Capuchino");
        menu.add("Latte");
        menu.add("Moka");
        appTest.displayMenu(menu);

        System.out.println("\n----- Prueba agregar cliente -----");
        ArrayList<String> customers = new ArrayList<String>();

        // --- Probar 4 veces ---
        // for (int i = 0; i < 4; i++) {
        // appTest.addCustomer(customers);
        // System.out.println("\n");
        // }
        System.out.println("\n----- Bonus Ninja -----");
        appTest.printPriceChart("Caf\u00e9 Colombiano Molido", 1000, 5);
    }
}
