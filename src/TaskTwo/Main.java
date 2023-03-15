package TaskTwo;

public class Main {
    public static void main(String[] args) {
        Cafe goodCoffee = new Cafe();
        goodCoffee.loadMenuData();
        for(String s : goodCoffee.getCoffeeMenu()){
            System.out.println(s);
        }
    }
}
