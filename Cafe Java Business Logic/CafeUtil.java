
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
}
