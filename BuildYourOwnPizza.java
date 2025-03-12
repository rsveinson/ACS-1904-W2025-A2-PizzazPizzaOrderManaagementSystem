import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 2
 * @Sveinson 
*/

public class BuildYourOwnPizza extends Pizza{
    // fields 
    // inherited
    // double price
    private Size size;
    
    /* number of toppings will be multiplied
     * by the price-per-topping of the selected
     * size to add to the price of the pizza
     */   
    private int numberOfToppings;
    
    // constructor
    public BuildYourOwnPizza(Size s, int not){
        size = s;
        numberOfToppings = not;
    }
    
    // getters
    public int getNumberOfToppings(){
        return numberOfToppings;
    }
    
    public Size getSize(){
        return size;
    }
    
    // setters
    public void setNumberOfToppings(int not){
        numberOfToppings = not;
    }
    
    public void setSize(Size s){
        size = s;
    }
    
    // other
    @Override
    public double calculatePizzaPrice(){
        double p = size.getBasePrice() + (numberOfToppings * size.getPricePerTopping());
        return p;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Build Your Own Pizza:\n");
        sb.append("Size: " + size.getDisplay() + "\n");
        sb.append("Price: $" + String.format("%.2f", size.getBasePrice()) + "\n");
        sb.append("Toppings: " + getNumberOfToppings() + " @ $");
        sb.append(String.format("%.2f",size.getPricePerTopping()));
        sb.append(" = $" + String.format("%.2f", (getNumberOfToppings() * size.getPricePerTopping())) + "\n");
        sb.append("Total Price: $" + String.format("%.2f", calculatePizzaPrice()));
        
        return sb.toString();
    }

}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
