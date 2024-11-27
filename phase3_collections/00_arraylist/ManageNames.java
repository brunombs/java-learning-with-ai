import java.util.ArrayList;
import java.util.List;

public class ManageNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bruno");
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("List size: " + names.size());

        System.out.println("Is the name Bruno in the list? " + names.contains("Bruno"));
        System.out.println("Is the name Julia in the list? " + names.contains("Julia"));


    }
}
