package edu.sdccd.cisc191.template;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class PillTextField extends TextField {
    public static Insets LABEL_PADDING3 = new Insets(0,200,0,200);

    /*Constructor for PillPanel used for formatting TextField dimensions*/
    public PillTextField() {
        this.setFont(Font.font(20));
        this.setPrefSize(50, 100);
    }
}
