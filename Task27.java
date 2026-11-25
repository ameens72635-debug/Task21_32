interface Playable {
    abstract void playMedia();
}

interface Downloadable {
    abstract void downloadMedia();
}

class MusicPlayer implements Playable, Downloadable {
    public void playMedia() {
        System.out.println("Playing Music....");
    }

    public void downloadMedia() {
        System.out.println("Downloading ...");
    }
}

public class Task27 {
    public static void main(String[] args) {
        MusicPlayer m = new MusicPlayer();
        m.playMedia();
        m.downloadMedia();
    }
}
