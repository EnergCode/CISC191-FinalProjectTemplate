package edu.sdccd.cisc191.template;

import javafx.embed.swing.JFXPanel;
import javafx.scene.layout.BorderPane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PillPanelLabelTest {
    @Test
    void makeSureIncrementIsWorking() {
        JFXPanel panel = new JFXPanel();
        BorderPane root = new BorderPane();
        PillCounter test = new PillCounter(root);
        PillPanelLabel label = new PillPanelLabel();
        label.incNumPillsTaken();
        assertEquals(1, label.amtPillsTaken);

    }
}