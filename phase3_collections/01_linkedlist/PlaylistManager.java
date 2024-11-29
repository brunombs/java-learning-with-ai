import java.util.LinkedList;

public class PlaylistManager {
    LinkedList<String> playlist;

    public PlaylistManager() {
        playlist = new LinkedList<>();
    }

    public void addSongToBeginning(String songName) {
        playlist.addFirst(songName);
    }

    public void addSongToEnd(String songName) {
        playlist.addLast(songName);
    }

    public void removeSongFromBeginning() {
        playlist.removeFirst();
    }

    public void removeSongFromEnd() {
        playlist.removeLast();
    }

    public void viewPlaylist() {
        System.out.println(playlist);
    }

    public static void main(String[] args) {
        PlaylistManager pm = new PlaylistManager();
        pm.addSongToBeginning("Song 1");
        pm.addSongToEnd("Song 2");
        pm.addSongToEnd("Song 3");
        pm.addSongToEnd("Song 4");
        pm.viewPlaylist();
        pm.removeSongFromBeginning();
        pm.removeSongFromEnd();
        pm.viewPlaylist();
    }
}
