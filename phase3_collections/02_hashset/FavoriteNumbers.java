import java.util.HashSet;

public class FavoriteNumbers {
    public static void main(String[] args) {
        HashSet<Integer> favoriteNumbers = new HashSet<>();
        favoriteNumbers.add(7);
        favoriteNumbers.add(2);
        favoriteNumbers.add(19);
        favoriteNumbers.add(21);
        favoriteNumbers.add(7);
        favoriteNumbers.add(37);
        favoriteNumbers.add(42);
        System.out.println("Favorite numbers: " + favoriteNumbers);
        System.out.println("Is the number 22 in the set?: " + favoriteNumbers.contains(22));
        System.out.println("Is the number 7 in the set?: " + favoriteNumbers.contains(7));
        favoriteNumbers.remove(7);
        System.out.println("Favorite numbers: " + favoriteNumbers);
    }
}
