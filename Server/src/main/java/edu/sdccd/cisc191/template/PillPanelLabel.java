package edu.sdccd.cisc191.template;
public class PillPanelLabel extends PanelLabel{
    int amtPillsTaken = 0;

    /*This constructor creates the  PillPanelLabel objects for the labels[
     * on the pill panel and initializes them to 0.*/
    public PillPanelLabel(){
        this.setText(String.valueOf(amtPillsTaken));
    }

    /*This method is responsible for incrementing the pill amounts
     * and uses this in order to ensure that this item is the one being
     * incremented when the method is called from its respective buttons.*/
    public void incNumPillsTaken(){
        amtPillsTaken++;
        this.setText(String.valueOf(amtPillsTaken));
    }

}
