import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("North Wall");
        Wall wall2 = new Wall("East Wall");
        Wall wall3 = new Wall("South Wall");
        Wall wall4 = new Wall("West Wall");


        List<Wall> walls = Arrays.asList(wall1, wall2, wall3, wall4);


        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);


        Room room = new Room("Generic Room", walls, ceiling);


        Bed bed = new Bed("King Size Bed",2,1,2,2);
        Lamp lamp = new Lamp(true, LampType.LAVA,200);
        Wardrobe wardrobe = new Wardrobe(4,50.5,2);
        Carpet carpet = new Carpet(2,3,PaintColor.RED);

        Bedroom bedroom = new Bedroom("Master Bedroom", walls, ceiling, bed, lamp, wardrobe, carpet);


        System.out.println("Bedroom name: " + bedroom.getName());
        System.out.println("Number of walls: " + bedroom.getWalls().size());

    }
}
