import java.util.Scanner;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = input.nextInt();

    if (age <= 12) {
        System.out.println("You are a kid");
    }
    else if (age >= 13 && age <= 17) {
        System.out.println("You are a teen");
    }
    else if (age >= 18 && age <= 59) {
        System.out.println("You are an adult");
    }
    else {
        System.out.println("You are a senior");
    }
}