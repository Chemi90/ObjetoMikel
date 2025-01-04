public class Main {
    public static void main(String[] args) {

        /*creamos garaje1*/
        Garaje opel = new Garaje("opel", 50.2, 10);
        /* fin garaje1*/
        /*creamos garaje2*/
        Garaje renault = new Garaje("Renault", 120, 5);

        Vehiculo iveco = new Camion("iveco", "blanco", "625CV", 2, 18 , 2, "Diesel");
        Vehiculo citroen = new Coche("citroen", "rojo", "205CV", 3, 4 , 5, "Gasolina");
        Vehiculo yamaha = new Moto("yamaha", "negro", "80CV", 2, 2, "250cc");

        renault.agregarVehiculo(0, iveco);
        renault.agregarVehiculo(1, citroen);
        renault.agregarVehiculo(2, yamaha);

        renault.mostrarVehiculo();
    }

}

