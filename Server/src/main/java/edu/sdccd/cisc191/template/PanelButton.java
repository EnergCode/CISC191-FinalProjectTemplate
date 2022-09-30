package edu.sdccd.cisc191.template;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class PanelButton extends Button {

    //used for creating default buttons
    public PanelButton() {
    };

    //used for creating Buttons on left side of screen with correct dimensions
    //Has selection parameter because this constructor is only used for selection buttons.
    public PanelButton(int selection){

        this.setFont(Font.font(20));
        this.setPrefSize(180, 180);
        labelDesignator(selection);
    }

    //Accepts integer selection as parameter and uses it to left side
    //panel buttons according to use.
    private void labelDesignator(int selection)
    {
        if(selection == 0) {
            this.setText("Pill Counter");
        }
        else if(selection == 1){
            this.setText("Note Pad");
        }
        else if(selection == 2) {
            this.setText("Calorie Counter");
        }
        else if(selection == 3) {
            this.setText("Draw Pad");
        }
        else if(selection == 4) {
            this.setText("Quit");
        }
    }
    /*Accepts integer as parameter for selecting the object
     * correlated with that button and starts that panel utility*/
    public void designateTask(int selection, BorderPane root)
    {
        if(selection == 0) {
            PillCounter pillCounter = new PillCounter(root);
        }
        else if(selection == 1){
            NotePad notePad = new NotePad(root);
        }
        else if(selection == 2) {
            CalorieCounter calorieCounter = new CalorieCounter(root);
        }
        else if(selection == 3) {
            DrawPanel test = new DrawPanel(root);
        }
        else if(selection == 4) {
            System.exit(0);
        }
    }
}
