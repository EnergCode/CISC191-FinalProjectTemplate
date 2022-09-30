package edu.sdccd.cisc191.template;

import javafx.embed.swing.JFXPanel;
import javafx.scene.layout.BorderPane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawPanelTest {
    @Test
    public void checkForLoopWorking(){
        BorderPane root = new BorderPane();
        JFXPanel panel = new JFXPanel();
        DrawPanel testDraw = new DrawPanel(root);
        assertEquals(1,testDraw.countMultiArrayInc(1));

    }
}