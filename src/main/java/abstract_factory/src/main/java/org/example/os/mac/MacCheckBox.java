package org.example.os.mac;

import org.example.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac Checkbox!");
    }
}
