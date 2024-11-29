import java.util.HashSet;

public class UniqueNames {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("Jane");
        names.add("Jack");
        names.add("Bob");
        names.add("Eve");
        System.out.println("Names: " + names);
        System.out.println("***Removing name Eve***");
        names.remove("Eve");
        System.out.println("Names updated: " + names);
        System.out.println("Is 'John' in the set? " + names.contains("John"));
        System.out.println("Is 'Bruno' in the set? " + names.contains("Bruno"));

    }
}
