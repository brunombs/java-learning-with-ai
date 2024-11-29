public class FindLargestElement {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 9, 4, 6};

        int highestNumber = numbers[0];

        for (int i =0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (numbers[i] > highestNumber) {
                highestNumber = numbers[i];
            }
        }

        System.out.println("Highest number: " + highestNumber);
    }
}
