package edu.sdccd.cisc191.template;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class PanelLabel extends Label {

    public static Insets LABEL_PADDING = new Insets(20);
    public static Insets LABEL_PADDING2 = new Insets(0,150,0,150);

    /*Used as generic label in cases where overloading constructors was not optimal*/
    public PanelLabel(String label){
        this.setFont(Font.font(40));
        this.setPadding(LABEL_PADDING2);
        this.setText(label);
    }

    /*Used as generic label in cases where overloading constructors was not optimal*/
    public PanelLabel() {
        this.setFont(Font.font(40));
        this.setPadding(LABEL_PADDING);
    }
}
