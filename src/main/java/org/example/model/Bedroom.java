package org.example.model;

import java.util.List;

public class Bedroom extends Room{
    Bed bed;
    Lamp lamp;
    Wardrobe wardrobe;
    Carpet carpet;

    public Bedroom(String name, List<Wall> walls, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        super(name, walls, ceiling);
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }


    public String getName() {
        return name;
    }

    public List<Wall> getWalls() {
        return walls;
    }


    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
