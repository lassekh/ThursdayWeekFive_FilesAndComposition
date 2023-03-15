package TaskThree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> officeBuilding = new ArrayList<>();
        officeBuilding.add(new Room(2,4,4));
        officeBuilding.add(new Room(4,16,8));
        officeBuilding.add(new Room(1,1,0));

        Building office = new Building(officeBuilding, 2,2,true);
    }
    public static void countLampsInBuilding(Building b){

    }
}
