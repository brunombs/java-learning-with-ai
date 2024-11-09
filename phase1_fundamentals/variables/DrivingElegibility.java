import java.util.Scanner;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean olderThan18;
    boolean hasDriverLicense;

    System.out.println("Welcome to the Driving Eligibility!");
    System.out.println("Do you have a driver license? (true/false)");
    hasDriverLicense = input.nextBoolean();
    if (!hasDriverLicense) {
        System.out.println("You can't drive");
        return;
    }

    System.out.println("Are you older than 18? (true/false)");
    olderThan18 = input.nextBoolean();

    if (olderThan18 && hasDriverLicense) {
        System.out.println("You are eligible to drive");
    }
    else {
        System.out.println("You are not eligible to drive");
    }
}