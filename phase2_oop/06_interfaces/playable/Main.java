package playable;

public class Main {
    public static void main(String[] args) {
        GuitarInterface guitarInterface = new GuitarInterface();
        PianoInterface pianoInterface = new PianoInterface();

        guitarInterface.play();
        pianoInterface.play();


    }
}
