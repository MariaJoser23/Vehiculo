public class Main {
    public static void main(String[] args) {
      
        Coche coche1 = new Coche("Toyota", "Corolla", 2020, 4);
        Coche coche2 = new Coche("Kia", "Kia Rio", 2018, 4);
        Coche coche3 = new Coche("Ford", "Mustang", 2021, 2);
        Coche coche4 = new Coche("Honda", "Honda Fit", 2017, 5);

        Motocicleta moto1 = new Motocicleta("Yamaha", "XTZ 250", 2020, true);
        Motocicleta moto2 = new Motocicleta("Yamaha", "NMAX 155", 2021, true);
        Motocicleta moto3 = new Motocicleta("Suzuki", "GN125", 2019, false);
        Motocicleta moto4 = new Motocicleta("Kawasaki", "KLX 250", 2020, false);

        coche1.describirVehiculo();
        System.out.println();
        coche2.describirVehiculo();
        System.out.println();
        coche3.describirVehiculo();
        System.out.println();
        coche4.describirVehiculo();
        System.out.println();

        moto1.describirVehiculo();
        System.out.println();
        moto2.describirVehiculo();
        System.out.println();
        moto3.describirVehiculo();
        System.out.println();
        moto4.describirVehiculo();
    }
}


