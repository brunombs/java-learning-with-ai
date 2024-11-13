package playable;

public class Main {
    public static void main(String[] args) {
        GuitarInterface guitarInterface = new GuitarInterface();
        PianoInterface pianoInterface = new PianoInterface();

        guitarInterface.play();
        guitarInterface.stop();
        pianoInterface.play();
        pianoInterface.stop();


    }
}
