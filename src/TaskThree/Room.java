package TaskThree;

public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;
    public Room(int doors, int lamps, int windows){
        this.numberOfDoors = doors;
        this.numberOfLamps = lamps;
        this.numberOfWindows = windows;
    }
    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }

    public int getNumberOfLamps(){
        return this.numberOfLamps;
    }
    public int getNumberOfWindows(){
        return this.numberOfWindows;
    }
}
