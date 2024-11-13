package vehicle;

public class Main {
    public static void main(String[] args) {
        CarDrivable carDrivable = new CarDrivable();
        carDrivable.drive();
        carDrivable.refuel();
        carDrivable.drive();
        carDrivable.park();
    }
}
