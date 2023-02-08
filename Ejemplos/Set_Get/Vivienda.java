public class Vivienda {
    private int habitaciones;
    private int banos;
    private boolean acabados;
    private String color;

    public Vivienda() {

    }

    public Vivienda(int habitaciones, int banos, boolean acabados, String color) {
        this.habitaciones = habitaciones;
        this.banos = banos;
        this.acabados = acabados;
        this.color = color;
    }

    public int getHabitaciones() {
        return this.habitaciones;
    }

    public int getBanos() {
        return this.banos;
    }

    public boolean getAcabados() {
        return this.acabados;
    }

    public String getColor() {
        return this.color;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public void setAcabados(boolean acabados) {
        this.acabados = acabados;
    }

    public void setColor(String color) {
        this.color = color;
    }
}