public class Rectangle {
    double width;
    double height;

    public double area() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 4;

        double area = rectangle.area();
        System.out.println("The area of the rectangle is " + area);
    }
}