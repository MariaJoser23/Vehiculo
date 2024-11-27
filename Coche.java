public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(String marca, String modelo, int año, int numPuertas) {
        super(marca, modelo, año);
        this.numPuertas = numPuertas;
    }

    @Override
    public void describirVehiculo() {
        System.out.println("Coche:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Número de puertas: " + numPuertas);
    }
}

