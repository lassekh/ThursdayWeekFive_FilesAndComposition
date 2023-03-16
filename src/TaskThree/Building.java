package TaskThree;

import java.util.ArrayList;

public class Building {
    private final ArrayList<Room> rooms; //Add final to variable
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;
    public Building(ArrayList<Room> rooms, int bathrooms, int floors, boolean isOfficeBuilding){
        this.rooms = rooms;
        this.numberOfBathrooms = bathrooms;
        this.numberOfFloors = floors;
        this.isOfficeBuilding = isOfficeBuilding;
    }
    public ArrayList<Room> getRooms(){
        return this.rooms;
    }
    public int getNumberOfBathrooms(){
        return this.numberOfBathrooms;
    }
    public int getNumberOfFloors(){
        return this.numberOfFloors;
    }
    public boolean getIsOfficeBuilding(){
        return this.isOfficeBuilding;
    }
}
