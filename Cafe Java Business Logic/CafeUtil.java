import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int i = 1;
        int sumResult = 0;

        while (i <= numWeeks) {
            sumResult = sumResult + i;
            i++;
        }

        return sumResult;
    }

    public double getOrderTotal(double[] prices) {
        double totalOrden = 0;

        for (int i = 0; i < prices.length; i++) {
            totalOrden += prices[i];
        }

        return totalOrden;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Por favor, ingresa tu nombre:");
        String userName = System.console().readLine();

        System.out.println("¡Hola, " + userName + "!");
        System.out.println("Hay " + customers.size() + " personas frente a ti");
        customers.add(userName);

        System.out.println(customers);
    }

    static public void customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println(value + "  " + pattern + "  " + output);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);

        String pattern = "$###,###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String formattedNumber = "";

        for (int i = 0; i < maxQuantity; i++) {
            if (i > 0)
                formattedNumber = decimalFormat.format((price * (i + 1)) - (400 * i));
            else
                formattedNumber = decimalFormat.format((price * (i + 1)));

            System.out.printf("%s - %s \n", i + 1, formattedNumber);
        }
    }
}
