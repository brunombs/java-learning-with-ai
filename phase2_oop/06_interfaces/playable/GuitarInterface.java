package playable;

public class GuitarInterface implements Playable {
    private int volume;

    public GuitarInterface(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to: " + this.volume);
    }

    void increaseVolume() {
        System.out.println("Current volume: " + volume);
        this.volume++;
        System.out.println("Volume increased. New volume: " + volume);
    }

    void decreaseVolume() {
        this.volume--;
        System.out.println("Volume decreased. New volume: " + volume);
    }

    @Override
    public void play() {
        System.out.println("Playing guitar sounds...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping guitar sounds...");
    }
}
