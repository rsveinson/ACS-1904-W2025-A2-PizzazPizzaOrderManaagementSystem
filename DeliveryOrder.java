import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 2
 * @Sveinson 
*/

public class DeliveryOrder extends Order{
    // constant for delivery charge
    final double deliveryCharge = 2.5;
    
    // field
    private String address;
    
    // construcor
    //public Order(String pn)
    public DeliveryOrder(String pn, String a){
        super(pn);
        address = a;
    }// end constructor
    
    // override the abstract method
    @Override
    public double calculateOrderPrice(){
        double totalPrice = 0;
        // loop through all of the pizzas in the order
        // add them all up
        for(Pizza p : pizzas){
            totalPrice += p.calculatePizzaPrice();
        }// end for
        
        // add the delivery charge
        totalPrice += deliveryCharge;
        
        return totalPrice;
    }// end calculate order price

    // getter and setter
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    // others
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n-------------------------\n");
        sb.append("Delivery order to: " + address + "\n");
        sb.append("order ID: " + id + "\n");
        sb.append("-------------------------\n");
        
        // now add each pizza in the order
        for(Pizza p : pizzas){
            sb.append(p + "\n\n");
        }
        sb.append("-------------------------\n");
        sb.append("Delivery: $" + String.format("%.2f", deliveryCharge) + "\n");
        sb.append("Total due: $" + String.format("%.2f",calculateOrderPrice()) + "\n");
        
        return sb.toString();
    }// end toString
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
