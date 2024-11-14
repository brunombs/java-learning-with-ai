public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = input.nextInt();

    System.out.print("Enter your height in cm: ");
    int height = input.nextInt();

    System.out.println("Your age is " + age);
    System.out.println("Your height is " + height + "cm");

    input.close();
}