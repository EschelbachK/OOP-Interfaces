package org.example;

// Videoplayer-Klasse, die Videos abspielt
public class VideoPlayer implements Playable {

    // Was passiert, wenn jemand play() aufruft
    @Override
    public void play() {
        // Meldung, dass jetzt ein Video läuft
        System.out.println("Spiele Video ab...");
    }
}
