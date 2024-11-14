import java.util.Scanner;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How much did you spent on your purchase? ");
    double value = input.nextDouble();

    if (value < 0) {
        System.out.println("Please enter a valid purchase amount.");
    } else {
        double discountPercentage;

        if (value <= 10) {
            discountPercentage = 0.05;
        } else if (value <= 100) {
            discountPercentage = 0.07;
        } else if (value <= 1000) {
            discountPercentage = 0.10;
        } else if (value <= 10000) {
            discountPercentage = 0.20;
        } else {
            discountPercentage = 0.25;
        }

        double discountAmount = value * discountPercentage;
        double totalAmount = value - discountAmount;

        System.out.printf("You have a %.0f%% discount.\n", discountPercentage * 100);
        System.out.printf("Discount amount: $%.2f\n", discountAmount);
        System.out.printf("Total amount to pay: $%.2f\n", totalAmount);
    }
}