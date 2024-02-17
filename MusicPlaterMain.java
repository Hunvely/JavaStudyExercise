package example;

public class MusicPlaterMain {

    public static void main(String[] args) {

        MusicPlayerObject player = new MusicPlayerObject();

        player.on();

        player.volumeUp();

        player.volumeUp();

        player.volumeUp();

        player.volumeDown();

        player.showStatus();

        player.off();


    }
}
