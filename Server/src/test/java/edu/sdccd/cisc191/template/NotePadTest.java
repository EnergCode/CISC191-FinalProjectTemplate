package edu.sdccd.cisc191.template;

import javafx.embed.swing.JFXPanel;
import javafx.scene.layout.BorderPane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotePadTest {
    @Test
    void notPadTest(){
        JFXPanel panel = new JFXPanel();
        BorderPane pane = new BorderPane();
        NotePad notePad = new NotePad(pane);
        assertEquals(0,notePad.bulletCount);
    }

}