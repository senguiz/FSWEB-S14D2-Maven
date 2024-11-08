package org.example.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int sheets, int height, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.sheets = sheets;
        this.height = height;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("The bed has been made.");
    }
    public int getPillows(){
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
