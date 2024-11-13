package playable;

public class PianoInterface implements Playable {
    @Override
    public void play() {
        System.out.println("Playing piano sounds");
    }
}
