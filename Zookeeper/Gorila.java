public class Gorila extends Mamifero {
    public Gorila(int nivelEnergia) {
        super(nivelEnergia);
    }

    public void lanzarAlgo() {
        nivelEnergia -= 5;
        System.out.println("Lanzando algo, energia disminuida en 5");
    }

    public void comerBananas() {
        nivelEnergia += 10;
        System.out.println("Comiendo bananas, energia aumentada en 10");
    }

    public void trepar() {
        nivelEnergia -= 10;
        System.out.println("Trepando arbol, energia disminuida en 10");
    }

}
