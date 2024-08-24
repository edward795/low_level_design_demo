package org.example;

import org.example.uifactory.UIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(UIFactory uiFactory){
        button=uiFactory.createButton();
        checkBox= uiFactory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
