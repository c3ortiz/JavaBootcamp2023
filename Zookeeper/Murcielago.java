public class Murcielago extends Mamifero {
    public Murcielago(int nivelEnergia) {
        super(nivelEnergia);
    }

    public void volar() {
        nivelEnergia -= 50;
        System.out.println("Murcielago despegando, energia disminuida en 50");
    }

    public void comerHumanos() {
        nivelEnergia += 25;
        System.out.println("Delicioso");
    }

    public void atacarPueblo() {
        nivelEnergia -= 100;
        System.out.println("*Gente pidiendo auxilio*");
    }
}
