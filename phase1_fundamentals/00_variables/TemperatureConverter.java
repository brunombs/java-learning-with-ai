public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a temperature in Fahrenheit: ");
    double fahrenheit = input.nextDouble();
    double celsius = (fahrenheit - 32) * 5 / 9;
    System.out.println(fahrenheit + " fahrenheit in celsius is " + celsius);
    input.close();
}