
/**
 * Enumeration class Planets - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Topping
{
    PEPPERONI("Pepperoni"), SAUSAGE("Sausage"), ONION("Onion"), 
    MUSHROOM("Mushroom"), PINEAPPLE("Pineapple"), OLIVES("Olives");
            
    private String friendlyName;    // this is for the extra challenge
    
    // constructor
    private Topping(String fn){
    }
    
    public String getFriendlyName(){
        return friendlyName;
    }
   
    @Override
    public String toString(){
        return friendlyName;
    }

}
