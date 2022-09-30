package edu.sdccd.cisc191.template;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class PanelButtonTest {

    @Test
    public void testButton(){
        JFXPanel panel = new JFXPanel();
        PanelButton test = new PanelButton(0);
        assertEquals("Pill Counter",test.getText());
    }

    @Test
    public void checkIteration(){
        JFXPanel panel = new JFXPanel();
        PanelButton test = new PanelButton(4);
        assertEquals("Quit",test.getText());
    }



}