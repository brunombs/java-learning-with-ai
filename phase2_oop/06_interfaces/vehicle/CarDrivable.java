package vehicle;

public class CarDrivable implements Drivable {
    @Override
    public void drive() {
        System.out.println("Driving the car");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the car");
    }

    @Override
    public void park() {
        System.out.println("Parking the car");
    }

    public void stop() {
        System.out.println("Stopping the car");
    }
}
