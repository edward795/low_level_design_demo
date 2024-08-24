package org.example.uifactory;

import org.example.Button;
import org.example.CheckBox;
import org.example.os.win.WinButton;
import org.example.os.win.WindowsCheckBox;

public class WinUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
