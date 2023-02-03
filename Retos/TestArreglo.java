public class TestArreglo {

    public static void main(String[] args) {
        MethodsUtil appTest = new MethodsUtil();

        int[] arregloNumeros = new int[] { -1, 2, 3, 4, 5, 6, 1, 12 };

        System.out.println(appTest.numeroMayor(arregloNumeros));
        System.out.println(appTest.sumatoriaTotal(arregloNumeros));
        System.out.println(appTest.factorialNum(4));
        System.out.println(appTest.serieFibonacci(13));

    }
}
