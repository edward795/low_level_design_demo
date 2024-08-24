package org.example.os.win;

import org.example.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button!");
    }
}
