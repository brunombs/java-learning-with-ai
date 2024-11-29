import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('h');
        stack.push('e');
        stack.push('l');
        stack.push('l');
        stack.push('o');

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        System.out.println("Reversed string: " + reversedString);
    }
}
