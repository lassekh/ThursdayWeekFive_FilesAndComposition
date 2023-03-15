package TaskTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();
    public void loadMenuData(){
        File file = new File("src/TaskTwo/coffees.txt");
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String s = scan.nextLine();
                coffeeMenu.add(s);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    public ArrayList<String> getCoffeeMenu(){
        return this.coffeeMenu;
    }
}
