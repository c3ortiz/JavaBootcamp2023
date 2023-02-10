
public class TestConductor {
    public static void main(String[] args) {
        Conductor pepe = new Conductor();

        pepe.conducir();
        pepe.conducir();
        pepe.conducir();
        pepe.conducir();

        pepe.utilizarPropulsores();
        pepe.conducir();
        pepe.utilizarPropulsores();

        pepe.llenarGasolina();
        pepe.llenarGasolina();
        pepe.llenarGasolina();
        pepe.llenarGasolina();
        pepe.llenarGasolina();
    }

}
