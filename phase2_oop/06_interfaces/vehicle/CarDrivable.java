package vehicle;

public class CarDrivable implements Drivable {
    @Override
    public void drive() {
        System.out.println("Drive car");
    }

    @Override
    public void refuel() {
        System.out.println("Refuel car");
    }

    @Override
    public void park() {
        System.out.println("Park car");
    }
}
