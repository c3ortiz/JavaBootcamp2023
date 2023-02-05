import java.util.ArrayList;

public class MethodsUtil {

    public int numeroMayor(int[] arregloNumeros) {
        int numMayor = arregloNumeros[0];

        for (int i : arregloNumeros) {
            if (i > numMayor)
                numMayor = i;
        }

        return numMayor;
    }

    public int sumatoriaTotal(int[] arregloNumeros) {
        int sumTotal = 0;

        for (int i : arregloNumeros) {
            sumTotal += i;
        }

        return sumTotal;
    }

    public int factorialNum(int numero) {
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public ArrayList<Integer> serieFibonacci(int numero) {
        ArrayList<Integer> fibonacciList = new ArrayList<>();
        int n1 = 0;
        int n2 = 1;
        fibonacciList.add(n1);
        fibonacciList.add(n2);
        int numeroNuevo = 0;

        while (numeroNuevo < numero) {
            numeroNuevo = n1 + n2;
            fibonacciList.add(numeroNuevo);
            n1 = n2;
            n2 = numeroNuevo;
        }

        return fibonacciList;
    }
}
