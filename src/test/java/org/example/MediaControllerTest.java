package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MediaControllerTest {

    @Test
    void playMedia_shouldCallPlay() {
        // Flag-Array, da Lambdas nur final/effektiv final nutzen dürfen
        boolean[] played = {false};

        // Playable mit Lambda definieren, das das Flag setzt
        Playable media = () -> played[0] = true;

        // MediaController ausführen
        new MediaController().playMedia(media);

        // Prüfen, ob play() aufgerufen wurde
        assertTrue(played[0]);
    }

    @Test
    void playMedia_shouldThrowExceptionIfPlayableFails() {
        // Playable definieren, das beim Aufruf eine RuntimeException wirft
        Playable failingMedia = () -> { throw new RuntimeException("Fehler"); };

        // Prüfen, ob die Exception korrekt weitergegeben wird
        assertThrows(RuntimeException.class, () -> new MediaController().playMedia(failingMedia));
    }
}
