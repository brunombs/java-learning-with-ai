package playable;

public class Main {
    public static void main(String[] args) {
        GuitarInterface guitarInterface = new GuitarInterface(5);
        PianoInterface pianoInterface = new PianoInterface();

        System.out.println("Current volume: " + guitarInterface.getVolume());
        guitarInterface.setVolume(8);
        guitarInterface.increaseVolume();
        guitarInterface.decreaseVolume();
        guitarInterface.play();
        guitarInterface.stop();
        pianoInterface.play();
        pianoInterface.stop();


    }
}
