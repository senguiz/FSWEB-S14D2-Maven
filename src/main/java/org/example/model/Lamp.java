package org.example.model;

import org.example.model.enums.LampType;

import javax.swing.text.Style;

public class Lamp {
    private boolean battery;
    private LampType style;
    private int globRating;

    public Lamp(boolean battery, LampType style, int globRating) {
        this.battery = battery;
        this.style = style;
        this.globRating = globRating;
    }
    public void turnOn(){
        System.out.println("Lamp has been turned on.");
    }
    public LampType getStyle(){
        return style;
    }
    public boolean isBattery(){
        return battery;
    }
    public int getGlobRating(){
        return globRating;
    }
}
