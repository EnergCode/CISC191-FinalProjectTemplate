package edu.sdccd.cisc191.template;

import javafx.embed.swing.JFXPanel;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PillCounterTest {
    @Test
    void pillCounterTest() {
        JFXPanel panel = new JFXPanel();
        BorderPane root = new BorderPane();
        PillCounter counter = new PillCounter(root);
        assertEquals("Pill Name",counter.pillName.getText());

    }

}