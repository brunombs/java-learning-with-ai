import java.util.LinkedList;

public class CustomerQueue {
    LinkedList<String> onQueue;

    public CustomerQueue(LinkedList<String> onQueue) {
        this.onQueue = onQueue;
    }

    void serveCustomer(){
        System.out.println("Customer served: " + onQueue.getFirst());
        onQueue.pop();
    }

    public static void main(String[] args) {
        LinkedList<String> onQueue = new LinkedList<>();
        CustomerQueue customerQueue = new CustomerQueue(onQueue);
        onQueue.add("A");
        onQueue.add("B");
        onQueue.add("C");
        System.out.println("Remaining customers: " + onQueue);
        customerQueue.serveCustomer();
        System.out.println("Remaining customers: " + onQueue);
        customerQueue.serveCustomer();
        System.out.println("Remaining customers: " + onQueue);
        customerQueue.serveCustomer();
    }
}
