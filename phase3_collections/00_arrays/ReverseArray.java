public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 1, 4};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
