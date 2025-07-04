package org.example;

public class Main {
    public static void main(String[] args) {

        // Musikplayer erstellen, als Playable gespeichert (Interface nutzen)
        Playable music = new MusicPlayer();

        // Videoplayer erstellen, auch als Playable
        Playable video = new VideoPlayer();

        // Controller erstellen, der die Medien steuert
        MediaController controller = new MediaController();

        // Musik abspielen
        controller.playMedia(music);

        // Video abspielen
        controller.playMedia(video);
    }
}
