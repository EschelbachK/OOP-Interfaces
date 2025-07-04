package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Testklasse für VideoPlayer
class VideoPlayerTest {

    @Test
    void play_shouldBeCallable() {
        // Flag, um zu merken, ob play() aufgerufen wurde
        boolean[] played = {false};

        // VideoPlayer erstellen, play() überschreiben, um Flag zu setzen
        VideoPlayer player = new VideoPlayer() {
            @Override
            public void play() {
                played[0] = true;
                super.play();
            }
        };

        // play() aufrufen
        player.play();

        // Prüfen, ob play() wirklich ausgeführt wurde
        assertTrue(played[0]);
    }
}
