package edu.sdccd.cisc191.template;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class DrawPanel
{
    /*Creates 100 x 100 array of button objects. Creates a header to be on the top
     * of an inner BorderPane that is created. This inner BorderPane is placed inside
     * the outer BorderPane that is accepted as a parameter and was initially created in
     * the MainPanel. This constructor sets all the components in the correct places and
     * creates a gridpane to hold individual button array elements. Uses Css style to
     * color buttons depending on the state they are in. If they are in defualt state, the
     * buttons turn red when pressed. If they are red, then they go back to default stat when
     * pressed*/
    public DrawPanel(BorderPane root)
    {
        Button[][] drawer = new Button[100][100];
        Label header = new Label();
        BorderPane drawPane = new BorderPane();
        GridPane drawHolder = new GridPane();
        drawPane.setCenter(drawHolder);
        root.setCenter(drawPane);

        header.setText("Click to draw!!");
        header.setFont(Font.font(20));
        drawPane.setTop(header);

        int arrayIncrementCount = 0;


        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                drawer[i][j] = new Button();

                drawHolder.add(drawer[i][j],i,j);
                int finalI = i;
                int finalJ = j;
                // handles css style color changes
                drawer[i][j].setOnAction(e -> {
                    if(drawer[finalI][finalJ].getStyle() != "-fx-background-color: #ff0000; ")
                    {
                        drawer[finalI][finalJ].setStyle("-fx-background-color: #ff0000; ");
                    }
                    else if (drawer[finalI][finalJ].getStyle() == "-fx-background-color: #ff0000; ")
                    {
                        drawer[finalI][finalJ].setStyle(null);
                    }
                });
                arrayIncrementCount++;
            }
        }
        if(countMultiArrayInc(arrayIncrementCount) == 10000){
            System.out.println(arrayIncrementCount);
        }

    }

    int countMultiArrayInc(int x) {
      return x;
    }
}

