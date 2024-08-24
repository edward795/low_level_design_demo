package org.example.uifactory;

import org.example.Button;
import org.example.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
