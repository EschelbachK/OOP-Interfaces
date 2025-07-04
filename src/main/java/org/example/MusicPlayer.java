package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Testklasse für MusicPlayer
class MusicPlayerTest {

    @Test
    void play_shouldBeCallable() {
        // Flag, um zu prüfen, ob play() aufgerufen wurde
        boolean[] played = {false};

        // MusicPlayer-Objekt mit überschriebenem play(), das Flag setzt
        MusicPlayer player = new MusicPlayer() {
            @Override
            public void play() {
                played[0] = true;
                super.play();
            }
        };

        // play() aufrufen
        player.play();

        // Prüfen, ob play() wirklich aufgerufen wurde
        assertTrue(played[0]);
    }
}
