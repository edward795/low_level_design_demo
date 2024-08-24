package org.example.uifactory;

import org.example.Button;
import org.example.CheckBox;
import org.example.os.mac.MacButton;
import org.example.os.mac.MacCheckBox;

public class MacUiFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
