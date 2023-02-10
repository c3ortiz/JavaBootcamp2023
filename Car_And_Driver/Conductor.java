
public class Conductor extends Automovil {

    public void conducir() {
        System.out.println("Conduciendo...");
        setGasolina(getGasolina() - 1);

        System.out.println(getGasolina() <= 0 ? "Juego terminado" : "Gasolina restante: " + getGasolina() + "/10");
    }

    public void utilizarPropulsores() {
        if (getGasolina() < 3) {
            System.out.println("Gasolina no suficiente");
        } else {
            System.out.println("Utilizando propulsores...");
            setGasolina(getGasolina() - 3);

            System.out.println(getGasolina() <= 0 ? "Juego terminado" : "Gasolina restante: " + getGasolina() + "/10");
        }
    }

    public void llenarGasolina() {
        if (getGasolina() > 8) {
            System.out.println("Tanque suficientemente lleno");
        } else {
            System.out.println("Llenando gasolina...");
            setGasolina(getGasolina() + 2);

            System.out.println(getGasolina() <= 0 ? "Juego terminado" : "Gasolina restante: " + getGasolina() + "/10");
        }
    }
}
