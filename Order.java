import java.util.ArrayList;

/** 
 * ACS-1904 Assignment 2
 * @Sveinson
*/

public abstract class Order{

    // class fields
    // the next available id number for an order
    private static int nextOrderID = 1000;
    
    // a list of one or more pizzas
    protected int id;                     // unique id number for each order
    protected ArrayList<Pizza> pizzas; // one or more pizzas make an order 
    protected String phoneNumber;       // duh
       
    // constructors
    public Order(){
        id = getNextID();
        pizzas = new ArrayList<>();
        phoneNumber = "unknown";
    }
    
    public Order(String pn){
        id = getNextID();
        pizzas = new ArrayList<>(); //empty array list
        phoneNumber = pn;
    }

    
    // abstract method must be implemented in derived classes
    public abstract double calculateOrderPrice();
    
    // getters
    public int getID(){
        return id;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public ArrayList<Pizza> getPizzas(){
        return pizzas;
    }
    
    // setters
    public void setPizzas(ArrayList<Pizza> p){
        pizzas = p;
    }
    
    public void setPhoneNumber(String pn){
        phoneNumber = pn;
    }
    
    // other
    // add a pizza to the list of pizzas
    // this is the association method
    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }
    
    // generate a unique id number for an order
    private int getNextID(){
        return nextOrderID++;
    }// end get id


}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
