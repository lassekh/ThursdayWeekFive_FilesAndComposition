package TaskOne;

import java.util.ArrayList;

public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
      customers.add(new Customer("Lasse", "lkh"));
      customers.add(new Customer("Hanni", "han"));
      customers.add(new Customer("Ahmad", "ahm"));
      customers.add(new Customer("Yossef", "you"));
      customers.add(new Customer("Egon", "egon99"));
      customers.add(new Customer("Lars", "lars"));

      printCustomers();

        /*int cNum = 6;
        while(customers.size() < cNum) {
            Customer c = new Customer("Lasse", "lkh");
            customers.add("Lasse", "lkh")
        }*/
    }
    public static void printCustomers(){
        for(Customer c : customers){
            System.out.println(c);
        }
    }
}