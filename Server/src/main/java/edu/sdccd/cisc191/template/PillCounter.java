package edu.sdccd.cisc191.template;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class PillCounter {
    BorderPane pillMenu;
    HBox headerHolder;
    VBox pillTypeRowHolder;
    PanelButton addPillButton;
    PanelLabel pillName;
    PanelLabel amountToTake;
    PanelLabel amountTaken;

    int numAddPillTypeCalled = 0;

    /*This constructor accepts the Main Panel BorderPane object and places another BorderPane
     * in the center. It creates a header object and also creates a Vbox to hold
     * each row of pill types. It also creates a button that is used to request the creation
     * of a new row. This constructor is also responsible for the formatting and placement of
     * children in correct parent container. Its addPillTypeHandle() method is used for providing
     * functionality to the button that is used for creating new rows for pill types.*/
    public PillCounter(BorderPane root){
        pillMenu = new BorderPane();
        headerHolder = new HBox();
        pillTypeRowHolder = new VBox();
        addPillButton = new PanelButton();

        pillName = new PanelLabel("Pill Name");
        amountToTake = new PanelLabel("Amount To Take");
        amountTaken = new PanelLabel("Amount Taken");

        root.setBottom(addPillButton);
        root.setCenter(pillMenu);
        pillMenu.setTop(headerHolder);
        pillMenu.setLeft(pillTypeRowHolder);

        headerHolder.getChildren().add(pillName);
        headerHolder.getChildren().add(amountToTake);
        headerHolder.getChildren().add(amountTaken);

        addPillButton.setPrefSize(300,50);
        addPillButton.setText("Click to add a pill type");
        pillMenu.setBottom(addPillButton);

        addPillTypeHandle();
    }

    /*Uses lambda expression to provide functionality to the button
     * that creates new rows for pill types and calls a method that
     * contains the body of this functionality.*/
    public void addPillTypeHandle(){
        addPillButton.setOnAction(e -> addPillType());

    }

    /*This method creates the contents of the Hbox row that holds the
     * information pertaining to each pill type. It creates the button that
     * increments the amount of pills taken. This method also keeps track of the
     * number of times it has been called in order to avoid cramming the panel.
     * Also, the labels for the amount of pills taken keep track of the button that is
     * incrementing them because the method that is used to increment the label uses the
     * "this" keyword ensuring that a specific label is correlated to a specific button at
     * the time that this method is called.*/
    public void addPillType(){
        if(numAddPillTypeCalled < 8){
            PillPanelLabel amtTaken = new PillPanelLabel();
            PanelButton incrementLabel = new PanelButton();
            PillTextField pllNme = new PillTextField();
            PillTextField amtToTake = new PillTextField();
            HBox pillInfoRow = new HBox();
            HBox fieldBox = new HBox();
            HBox buttLblBox = new HBox();

            pllNme.setPrefWidth(400);

            amtToTake.setPrefWidth(100);

            amtTaken.setFont(Font.font(40));

            incrementLabel.setPrefSize(100,100);
            incrementLabel.setText("+");
            incrementLabel.setOnAction(e -> {
                amtTaken.incNumPillsTaken();
            });

            fieldBox.setSpacing(300);
            fieldBox.getChildren().addAll(pllNme, amtToTake);

            buttLblBox.setSpacing(100);

            buttLblBox.getChildren().addAll(amtTaken, incrementLabel);

            pillInfoRow.setSpacing(400);
            pillInfoRow.getChildren().addAll(fieldBox,buttLblBox);

            pillTypeRowHolder.getChildren().add(pillInfoRow);
            numAddPillTypeCalled++;
            System.out.println("Objects Created");
        }

    }


}
