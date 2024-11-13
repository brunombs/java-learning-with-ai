public class Product {
    private final String name;
    private final double price;
    private final int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValue(){
        return price * quantity;
    }

    public static void main(String[] args) {
        Product computer = new Product("Computer", 1500, 10);
        Product bicycle = new Product("Bicycle", 550.99, 30);

        System.out.println(computer.totalValue());
        System.out.println(bicycle.totalValue());
    }
}
