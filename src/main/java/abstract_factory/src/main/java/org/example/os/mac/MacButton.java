package org.example.os.mac;

import org.example.Button;

public class MacButton implements Button {
    @Override
    public void paint(){
        System.out.println("Mac Button!");
    }
}
