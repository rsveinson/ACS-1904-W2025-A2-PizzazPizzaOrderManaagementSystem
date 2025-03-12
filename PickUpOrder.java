import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 2
 * @Sveinson 
*/

public class PickUpOrder extends Order{
    private String name;        // who's picking it up
    
    // constructor
    //public Order(String pn)
    public PickUpOrder(String pn, String n){
        super(pn);
        name = n;
    }
    
    // override abstract method
    @Override
    public double calculateOrderPrice(){
        double totalPrice = 0;
        // loop through all of the pizzas in the order
        // add them all up
        for(Pizza p : pizzas){
            totalPrice += p.calculatePizzaPrice();
        }
        return totalPrice;
    }// end calculate order price
    
    // getter and setter
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n-------------------------\n");
        sb.append("Pick up order for: " + name + "\n");
        sb.append("order ID: " + id + "\n");
        sb.append("-------------------------\n");
        
        // now add each pizza in the order
        for(Pizza p : pizzas){
            sb.append(p + "\n\n");
        }
        sb.append("-------------------------\n");
        sb.append("Total due: $" + String.format("%.2f",calculateOrderPrice()) + "\n");
        
        return sb.toString();
    }// end toString

}

