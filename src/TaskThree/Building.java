package TaskThree;

import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms = new ArrayList<>(); //Add final to variable
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;
    Building(ArrayList<Room> rooms, int bathrooms, int floors, boolean isOfficeBuilding){
        this.rooms = rooms;
        this.numberOfBathrooms = bathrooms;
        this.numberOfFloors = floors;
        this.isOfficeBuilding = isOfficeBuilding;
    }
}
