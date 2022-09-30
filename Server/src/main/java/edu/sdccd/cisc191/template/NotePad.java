package edu.sdccd.cisc191.template;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;

public class NotePad {

    BorderPane notePadHolder;
    VBox bulletHolder;
    HBox sentenceHolder;
    PanelLabel bullet;
    TextField note;

    int bulletCount = 0;

    /*Accepts BorderPane object from main Panel.
     * Places secondary BorderPane in center of primary BorderPane
     * and places Vbox for holding bullet points on the left side of
     * panel utility. Also has method for creating button that creates new rows*/
    public NotePad(BorderPane root){
        notePadHolder = new BorderPane();
        bulletHolder = new VBox();

        root.setCenter(notePadHolder);
        notePadHolder.setLeft(bulletHolder);

        newLabelHandle();
    }

    /*Creates button to be placed on bottom of screen that allows for the
     * creation of new bullets*/
    private void newLabelHandle(){
        PanelButton rowCreationButton = new PanelButton();
        rowCreationButton.setText("Create New Bullet");
        rowCreationButton.setFont(Font.font(40));
        rowCreationButton.setOnAction(e -> addLabelToRow());
        notePadHolder.setBottom(rowCreationButton);
    }

    /*This method is called by the button on the bottom of the screen
     * through a lambda expression. It creates the actual bullet points to
     * be placed on the left side of the inner BorderPane. It also creates a text field
     * that is place directly to the right of the bullet. These two objects are placed inside an
     * Hbox with is placed inside the Vbox on the left side of the screen. It also keeps track
     * of the amount of rows created so that rows to not cram the panel.*/
    private void addLabelToRow() {
        if(bulletCount < 8){
            sentenceHolder = new HBox();
            bullet = new PanelLabel();
            note = new TextField();

            bullet.setText("•");
            note.setPrefSize(1000, 80);
            note.setFont(Font.font(40));

            bulletHolder.getChildren().add(sentenceHolder);
            sentenceHolder.getChildren().add(bullet);
            sentenceHolder.getChildren().add(note);
        }
        bulletCount++;
    }




}
