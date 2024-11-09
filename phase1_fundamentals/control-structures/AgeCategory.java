import java.util.Scanner;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = input.nextInt();

    if (age <0) {
        System.out.println("You are on line to come to this world");
    }
    else if (age <= 12) {
        System.out.println("You are a kid");
    }
    else if (age <= 17) {
        System.out.println("You are a teen");
    }
    else if (age <= 59) {
        System.out.println("You are an adult");
    }
    else if (age <= 110) {
        System.out.println("You are a senior");
    }
    else {
        System.out.println("You are something out of this world!");
    }
}