
package uaslp.enginering.labs;

public class Button extends Control {

    private String label;

    public Button(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void draw() {
        System.out.print("<" + label + ">");
    }
}