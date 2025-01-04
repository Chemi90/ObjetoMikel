public class Coche extends Vehiculo{

    // ATRIBUTOS
    private int puertas;
    private String combustible;

    public Coche(String nombre, String color, String motor, int retrovisores, int ruedas, int puertas, String combustible) {
        super(nombre, color, motor, retrovisores, ruedas);
        this.puertas = puertas;
        this.combustible = combustible;
    }

    public Coche() {
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "puertas=" + puertas +
                ", combustible='" + combustible + '\'' +
                "} " + super.toString();
    }
}
