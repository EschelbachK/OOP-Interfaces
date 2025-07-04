package org.example;

// Controller, der sich darum kümmert, was abgespielt wird
public class MediaController {

    // Methode, die ein beliebiges abspielbares Ding bekommt und dann abspielt
    public void playMedia(Playable media) {
        // Einfach die play-Methode vom Objekt aufrufen
        media.play();
    }
}
