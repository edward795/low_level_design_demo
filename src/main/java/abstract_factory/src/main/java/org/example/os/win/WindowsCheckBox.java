package org.example.os.win;

import org.example.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Windows CheckBox!");
    }
}
