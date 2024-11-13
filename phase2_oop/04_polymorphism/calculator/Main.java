package calculator;

public class Main {
    public static void main() {
        calculator calc = new calculator();

        System.out.println(calc.add(5,7));
        System.out.println(calc.subtract(52,14));
        System.out.println(calc.add(9,23, 54));
    }
}
