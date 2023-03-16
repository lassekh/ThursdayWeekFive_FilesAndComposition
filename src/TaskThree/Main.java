package TaskThree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> officeBuilding = new ArrayList<>();
        officeBuilding.add(new Room(2,4,4));
        officeBuilding.add(new Room(4,16,8));
        officeBuilding.add(new Room(1,1,0));

        Building office = new Building(officeBuilding, 2,3,true);

        int totalLamps = countLampsInBuilding(office);
        System.out.println(totalLamps);

        boolean buildingType = isNormal(office);
        System.out.println(buildingType);
    }
    public static int countLampsInBuilding(Building b){
        //Count number of lamps
        //Get rooms in building...
        //Get number of lamps in each room...
        //Plus number of lamps
        int lampsNum = 0; //Variable to store number of lamps
        for(Room r : b.getRooms()){
            lampsNum += r.getNumberOfLamps();
        }
        return lampsNum;
    }
    public static boolean isNormal(Building b){
        if(b.getNumberOfFloors() > b.getRooms().size()) {
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}
