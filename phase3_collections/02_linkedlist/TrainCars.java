import java.util.LinkedList;

public class TrainCars {
    public static void main(String[] args) {
        LinkedList<String> train = new LinkedList<>();
        train.add("Engine");
        train.add("Passenger car");
        train.add("Dining car");
        train.add("Caboose");
        train.addFirst("Freight Car");
        train.addLast("Freight Car");
        System.out.println("List: " + train);
        train.removeFirst();
        System.out.println("Updated list: " + train);
    }
}
