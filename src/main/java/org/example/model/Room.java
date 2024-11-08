package org.example.model;

import java.util.List;

public class Room {
    String name;
    List<Wall> walls;
    Ceiling ceiling;

    public Room(String name, List<Wall> walls, Ceiling ceiling) {
        this.name = name;
        this.walls = walls;
        this.ceiling = ceiling;
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
}
