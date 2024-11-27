public class Motocicleta extends Vehiculo {
    
    private boolean tieneRadiador;

    public Motocicleta(String marca, String modelo, int año, boolean tieneRadiador) {
        super(marca, modelo, año); 
        this.tieneRadiador = tieneRadiador;
    }

    @Override
    public void describirVehiculo() {
        System.out.println("Motocicleta:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Tiene radiador: " + (tieneRadiador ? "Sí" : "No"));
    }
}

