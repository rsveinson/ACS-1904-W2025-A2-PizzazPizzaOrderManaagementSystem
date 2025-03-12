import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 2
 * @Sveinson 
*/

public class SpecialtyPizza extends Pizza{
    // fields
    private SpecialtyType type;
    
    // constructor
    public SpecialtyPizza(SpecialtyType t){
        this.type = t;
    }
    
    // overrride abstract method
    @Override
    public double calculatePizzaPrice(){
        return type.getPrice();
    }
    
    // getter and setter
    public SpecialtyType getType(){
        return type;
    }
    
    public void setType(SpecialtyType type){
        this.type = type;
    }
    
    // others
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Specialty Pizza:\n");
        sb.append("Type: " + type.getDisplay() + "\n");
        sb.append("Price: $" + String.format("%.2f", calculatePizzaPrice()) + "\n");
        
        
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
