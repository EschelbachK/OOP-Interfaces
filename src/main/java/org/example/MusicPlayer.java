package org.example;

// Musikspieler-Klasse, die Musik abspielen kann
public class MusicPlayer implements Playable {

    // Was passiert, wenn jemand play() aufruft
    @Override
    public void play() {
        // Einfach nur ’ne Nachricht, dass gerade ein Song läuft
        System.out.println("Spiele Song ab...");
    }
}
