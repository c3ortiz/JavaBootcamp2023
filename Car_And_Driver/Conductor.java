
public class Conductor extends Automovil {

    public void conducir() {
        System.out.println("Conduciendo...");
        setGasolina(getGasolina() - 1);

        System.out.println(getGasolina() <= 0 ? "Gasolina restante: " + getGasolina() + "/10" : "Juego terminado");
    }

    public void utilizarPropulsores() {
        System.out.println("Utilizando propulsores...");
        setGasolina(getGasolina() - 3);

        System.out.println(getGasolina() <= 0 ? "Gasolina restante: " + getGasolina() + "/10" : "Juego terminado");
    }

    public void llenarGasolina() {
        System.out.println("Llenando gasolina...");
        setGasolina(getGasolina() + 2);

        System.out.println(getGasolina() <= 0 ? "Gasolina restante: " + getGasolina() + "/10" : "Juego terminado");
    }
}
