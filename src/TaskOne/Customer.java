package TaskOne;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    Customer(String firstName, String username){
        this.firstName = firstName;
        this.username = username;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getUsername(){
        return this.username;
    }
    public int getID(){
        return this.id;
    }
    @Override
    public String toString(){
        return "Customer: " + getFirstName() + " " + getLastName() + "\n" + "Username: " + getUsername();
    }

}
