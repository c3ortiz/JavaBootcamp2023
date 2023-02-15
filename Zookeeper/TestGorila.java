public class TestGorila {
    public static void main(String[] args) {
        Gorila dk = new Gorila(100);

        dk.lanzarAlgo();
        dk.lanzarAlgo();
        dk.lanzarAlgo();
        dk.comerBananas();
        dk.comerBananas();
        dk.trepar();

        System.out.println(dk.mostrarNivelEnergia());

        Murcielago covid = new Murcielago(300);

        covid.atacarPueblo();
        covid.atacarPueblo();
        covid.atacarPueblo();
        covid.comerHumanos();
        covid.comerHumanos();
        covid.volar();
        covid.volar();

        System.out.println(covid.mostrarNivelEnergia());
    }
}
