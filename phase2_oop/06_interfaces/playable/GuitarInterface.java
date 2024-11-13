package playable;

public class GuitarInterface implements Playable {
    @Override
    public void play() {
        System.out.println("Playing guitar sounds");
    }

    @Override
    public void stop() {
        System.out.println("Stopping guitar sounds");
    }
}
