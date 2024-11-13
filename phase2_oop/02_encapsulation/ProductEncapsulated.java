public class ProductEncapsulated {
    private String name;
    private double price;
    private int quantity;

    public ProductEncapsulated(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
        ProductEncapsulated product = new ProductEncapsulated("Laptop", 1500.00, 3);
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Total Value: " + product.calculateTotalValue());

        product.setName("Gaming Laptop");
        product.setPrice(1800.00);
        product.setQuantity(5);

        System.out.println("\nUpdated Product Details:");
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Updated Total Value: " + product.calculateTotalValue());
    }
}
