package animal_cat;

public class Main {
    public static void main() {
        AnimalPolymorphism animalPolymorphism = new AnimalPolymorphism();
        CatPolymorphism catPolymorphism = new CatPolymorphism();

        animalPolymorphism.makeSound();
        catPolymorphism.makeSound();
    }
}
