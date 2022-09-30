package edu.sdccd.cisc191.template;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class CalorieCounter {

    BorderPane calorieCounterHolder;
    HBox headerHolder;
    HBox totalCalorieInputHolder;
    HBox amountFromGoalHolder;

    PanelLabel calorieGoalLabel;
    TextField actualCalorieGoal;
    PanelButton updateCalorieGoalButton;
    PanelLabel currentTotalLabel;
    PanelLabel actualCurrentTotal;

    PanelLabel calorieInputLabel;
    TextField calorieInputField;
    PanelButton updateCalorieInputButton;


    PanelLabel amountFromGoalLabel;
    PanelLabel actualAmountFromGoal;

    String holdCalorieGoal;;

    /*This constructor creates accepts the MainPanel BorderPane and uses
     * it to store another BorderPane. The inner BorderPane is used
     * to set the positions of three Hbox objects that are responsible for holding
     * the elements of the Panel. These elements include Label objects with corresponding
     * text fields. The constructor sets the correct sizes and spacing between relevant objects.
     * Finally, the constructor calls methods that set the functiion of buttons on the Panel.*/
    public CalorieCounter(BorderPane root){

        calorieCounterHolder = new BorderPane();
        headerHolder = new HBox();
        totalCalorieInputHolder = new HBox();
        amountFromGoalHolder = new HBox();

        calorieGoalLabel = new PanelLabel();
        actualCalorieGoal = new TextField("0");
        updateCalorieGoalButton = new PanelButton();
        currentTotalLabel = new PanelLabel();
        actualCurrentTotal = new PanelLabel();

        calorieInputLabel = new PanelLabel();
        calorieInputField = new TextField("0");
        updateCalorieInputButton = new PanelButton();

        amountFromGoalLabel = new PanelLabel();
        actualAmountFromGoal = new PanelLabel();

        root.setCenter(calorieCounterHolder);
        calorieCounterHolder.setTop(headerHolder);
        calorieCounterHolder.setCenter(totalCalorieInputHolder);
        calorieCounterHolder.setBottom(amountFromGoalHolder);

        headerHolder.getChildren().addAll(calorieGoalLabel,actualCalorieGoal,updateCalorieGoalButton,currentTotalLabel,actualCurrentTotal);
        totalCalorieInputHolder.getChildren().addAll(calorieInputLabel,calorieInputField,updateCalorieInputButton);
        amountFromGoalHolder.getChildren().addAll(amountFromGoalLabel,actualAmountFromGoal);

        headerHolder.setSpacing(150);
        calorieGoalLabel.setText("Calorie Goal: ");
        updateCalorieGoalButton.setPrefSize(100,100);
        updateCalorieGoalButton.setText("SUBMIT");
        actualCalorieGoal.setPrefSize(200,100);
        actualCalorieGoal.setFont(Font.font(20));
        currentTotalLabel.setText("Current Total: ");
        actualCurrentTotal.setText("0");

        calorieInputLabel.setText("Input your calories for this meal");
        calorieInputField.setFont(Font.font(20));
        calorieInputField.setPrefSize(200,100);
        updateCalorieInputButton.setPrefSize(100,100);
        updateCalorieInputButton.setText("SUBMIT");

        amountFromGoalLabel.setText("Calories Left: ");
        actualAmountFromGoal.setText("0");
        setUpdateCalorieGoalButtonActions();
        setUpdateCalorieInputButtonActions();

        totalCalorieInputHolder.setAlignment(Pos.CENTER);
    }

    /*This method is used to calculate the amount of calories from the
     * target calories. It used exception handling to ensure that the
     * input is an integer value. Values are converted from string to
     * integer for subtraction and value is returned to as a string after
     * conversion.*/
    private String calculateCaloriesFromGoal() {
        int goalCalories = 0;
        int currentCalories = 0;

        while (true) {
            try{
                goalCalories = Integer.valueOf(actualCalorieGoal.getText());
            }
            catch (NumberFormatException err)
            {
                actualCalorieGoal.setText("Only Numbers");
            }
            try{
                currentCalories = Integer.valueOf(actualCurrentTotal.getText());
            }
            catch (NumberFormatException err)
            {
                actualCurrentTotal.setText("Only Numbers");
            }
            break;
        }

        String totCal = String.valueOf(goalCalories - currentCalories);

        return totCal;
    }

    /*This method holds the lambda expression that controls the button
     * that accepts goal calorie input*/
    private void setUpdateCalorieGoalButtonActions() {
        updateCalorieGoalButton.setOnAction(e -> {
            holdCalorieGoal = actualAmountFromGoal.getText();
            actualAmountFromGoal.setText(calculateCaloriesFromGoal());
        });
    }

    /*This method provides functionality to the button that accepts input for
     * the calorie amounts of individual meals and uses exception handling to
     * ensure that integer values are being used. The values are initially accepted from
     * the TextField as a string but are converted to integers for addition and back to string
     * for setting text.*/
    private void setUpdateCalorieInputButtonActions(){
        updateCalorieInputButton.setOnAction(e -> {
            int actualCurrentTotalAsInt = 0;
            int calorieInputFieldAsInt = 0;
            while(true)
            {
                try{
                    actualCurrentTotalAsInt = Integer.valueOf(actualCurrentTotal.getText());
                }
                catch(NumberFormatException err) {
                    actualCurrentTotal.setText("Only Numbers");
                }
                try{
                    calorieInputFieldAsInt = Integer.valueOf(calorieInputField.getText());
                }catch (NumberFormatException err) {
                    calorieInputField.setText("Only Numbers");
                }
                break;
            }

            String totalCalories = String.valueOf(actualCurrentTotalAsInt + calorieInputFieldAsInt);
            actualCurrentTotal.setText(totalCalories);
            actualAmountFromGoal.setText(calculateCaloriesFromGoal());
        });
    }


}
