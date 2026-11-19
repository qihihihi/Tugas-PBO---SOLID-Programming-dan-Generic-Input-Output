
interface Vehicle {
    void bergerak();
}

interface EngineStartable {
    void startEngine();
}

interface Fuelable {
    void isiBahanBakar();
}

interface BatteryRechargeable {
    void isiBaterai();
}

// Mobil listrik
class ElectricCar implements Vehicle,
        EngineStartable, BatteryRechargeable {

    public void bergerak() {
        System.out.println("Mobil listrik berjalan.");
    }

    public void startEngine() {
        System.out.println("Menyalakan sistem mobil listrik.");
    }

    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil listrik.");
    }
}

// Mobil bensin
class GasolineCar implements Vehicle,
        EngineStartable, Fuelable {

    public void bergerak() {
        System.out.println("Mobil bensin berjalan.");
    }

    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin.");
    }

    public void isiBahanBakar() {
        System.out.println("Mengisi bensin.");
    }
}

// Sepeda
class Bicycle implements Vehicle {

    public void bergerak() {
        System.out.println("Sepeda sedang dikayuh.");
    }
}

public class Main {
    public static void main(String[] args) {

        ElectricCar listrik = new ElectricCar();
        listrik.startEngine();
        listrik.isiBaterai();
        listrik.bergerak();

        GasolineCar bensin = new GasolineCar();
        bensin.startEngine();
        bensin.isiBahanBakar();
        bensin.bergerak();

        Bicycle sepeda = new Bicycle();
        sepeda.bergerak();
    }
}
