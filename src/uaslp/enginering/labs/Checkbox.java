package uaslp.enginering.labs;

public class Checkbox extends Control {
    private String textCheckBox;

    public Checkbox(String text) {
        textCheckBox = text;
    }
    protected void draw(){
        System.out.print("[]" + textCheckBox);
    }
}