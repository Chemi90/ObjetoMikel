public class Moto extends Vehiculo{
    // crear atributos
    private String cilindrada;

    public Moto(String nombre, String color, String motor, int retrovisores, int ruedas, String cilindrada) {
        super(nombre, color, motor, retrovisores, ruedas);
        this.cilindrada = cilindrada;
    }

    public Moto() {
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada='" + cilindrada + '\'' +
                "} " + super.toString();
    }
}
