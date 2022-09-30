package edu.sdccd.cisc191.template;

import javafx.embed.swing.JFXPanel;
import javafx.scene.layout.BorderPane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalorieCounterTest {

    @Test
    void testCalorieCounterVariableInitialization(){
        JFXPanel panel = new JFXPanel();
        BorderPane root = new BorderPane();
        CalorieCounter test = new CalorieCounter(root);

        assertEquals("0", test.actualCalorieGoal.getText());
    }

}