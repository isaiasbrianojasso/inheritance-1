package uaslp.enginering.labs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListBox extends Control{
    private List<String> options;
    public ListBox(String ...options) {
        this.options = new ArrayList<>(options.length);
        for (String option:
                options) {
            this.options.add(option);
        }

    }

    protected void draw(){
        for (String option :
                options) {
            System.out.print(option + " - ");
        }
    }
}