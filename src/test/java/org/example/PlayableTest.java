package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Testklasse für das Playable-Interface (eigentlich eher für Implementierungen)
class PlayableTest {

    @Test
    void play_shouldBeCallable() {
        // Flag, um zu merken, ob play() aufgerufen wurde
        boolean[] played = {false};

        // Anonyme Implementierung von Playable, die das Flag setzt, wenn play() aufgerufen wird
        Playable playable = () -> played[0] = true;

        // play() aufrufen
        playable.play();

        // Prüfen, ob play() wirklich aufgerufen wurde
        assertTrue(played[0]);
    }
}
