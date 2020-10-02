package uaslp.enginering.labs;

import java.util.LinkedList;
import java.util.List;

public class Menu extends Control {

    List<Control> controls;
    private String menuTitle;

    public Menu() {
        controls = new LinkedList<>();
    }

    public Menu(String menuTitle) {
        controls = new LinkedList<>();
        this.menuTitle = menuTitle;
    }

    public void addOption(Control control) {
        controls.add(control);
    }

    public void addOption(Control control, String shortcutKey) {
        controls.add(control);

    }

    public void draw() {
        if (menuTitle != null) {
            System.out.println(System.lineSeparator() + menuTitle);
        }
        for (Control control : controls) {
            control.draw();
            System.out.println();
        }
    }


}
