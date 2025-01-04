public class Vehiculo {

    private String nombre;
    private int ruedas;
    private int retrovisores;
    private String motor;
    private String color;

    public Vehiculo(String nombre, String color, String motor, int retrovisores, int ruedas) {
        this.nombre = nombre;
        this.color = color;
        this.motor = motor;
        this.retrovisores = retrovisores;
        this.ruedas = ruedas;
    }

    public Vehiculo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRetrovisores() {
        return retrovisores;
    }

    public void setRetrovisores(int retrovisores) {
        this.retrovisores = retrovisores;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", ruedas=" + ruedas +
                ", retrovisores=" + retrovisores +
                ", motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
