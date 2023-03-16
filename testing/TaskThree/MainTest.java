package TaskThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void countLampsInBuilding() {
        ArrayList<Room> testBuilding = new ArrayList<>();
        testBuilding.add(new Room(2,4,4));
        testBuilding.add(new Room(4,16,8));
        testBuilding.add(new Room(1,1,0));

        Building testOffice = new Building(testBuilding, 2,3,true);
        assertEquals(21, Main.countLampsInBuilding(testOffice));
    }

    @org.junit.jupiter.api.Test
    void isNormal() {
        ArrayList<Room> testBuilding = new ArrayList<>();
        testBuilding.add(new Room(2,4,4));
        testBuilding.add(new Room(4,16,8));
        testBuilding.add(new Room(1,1,0));

        Building testOffice = new Building(testBuilding, 2,4,true);
        assertEquals(true, Main.isNormal(testOffice));
    }
}