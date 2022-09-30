package edu.sdccd.cisc191.template;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//David De La Toba
//September 29
//Professor Andrew Huang

public class Server extends Application
{
    private PanelLabel appTitle;

    // Puts title on main panel
    public void updateHeader()
    {
        appTitle = new PanelLabel();
        appTitle.setText("Personal Task Manager");
    }


    public static void main(String[] args)
    {
        launch();
    }
    /*Creates main stage, scene and BorderPane.
    Puts Vbox on left side of screen to hold main selection buttons.
    Creates 5 PanelButton objects to place in vbox on left side.
    Places app title on the top of BorderPane
    */
    @Override
    public void start(Stage stage) throws Exception {
        updateHeader();
        BorderPane root = new BorderPane();
        VBox leftSidePanel = new VBox();
        HBox topSidePanel = new HBox(appTitle);

        root.setTop(topSidePanel);
        root.setLeft(leftSidePanel);


        for(int i = 0; i < 5; i++) {
            PanelButton button = new PanelButton(i);
            leftSidePanel.getChildren().add(button);
            int finalI = i;
            button.setOnAction(e -> {
                button.designateTask(finalI, root);});
        }


        Scene scene = new Scene(root, 1920, 1080);
        stage.setTitle("JavaFxProject");
        stage.setScene(scene);
        stage.show();
    }

}
