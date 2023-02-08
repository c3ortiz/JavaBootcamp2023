public class TestVivienda {
    public static void main(String[] args) {

        Vivienda casa1 = new Vivienda();
        Vivienda casa2 = new Vivienda(3, 2, false, "Verde");

        casa1.setHabitaciones(5);
        casa1.setBanos(1);
        casa1.setAcabados(true);
        casa1.setColor("Blue");

        System.out.println(casa1.getBanos());
        System.out.println(casa2.getAcabados());

    }
}
