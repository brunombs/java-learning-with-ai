public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your grade? (A/B/C/D/F)");
    String grade = input.nextLine().toUpperCase();

    switch (grade) {
        case "A":
            System.out.println("Excellent! You received an A.");
            break;
        case "B":
            System.out.println("Good job! You received a B.");
            break;
        case "C":
            System.out.println("You passed with a C. Keep striving!");
            break;
        case "D":
            System.out.println("You received a D. It's time to improve!");
            break;
        case "F":
            System.out.println("Unfortunately, you received an F. Don't give up!");
            break;
        default:
            System.out.println("Invalid grade! Please enter A, B, C, D, or F.");
            break;
    }

    input.close();
}