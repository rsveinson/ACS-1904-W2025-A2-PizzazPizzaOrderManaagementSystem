
/**
 * ACS-1904 W2023
 * Assignment 2
 * Enum: types of specialty pizzas
 */
public enum SpecialtyType
{
    SUPREME("Supreme", 25.0), ROMA("Roma", 24.0),
    CANADIAN("Canadian", 24.0), ALFREDO("Alfredo", 23.5);
            
    private String display;    // this is for the extra challenge
    private double price;
    
    // constructor
    private SpecialtyType(String d, double p){
        display = d;
        price = p;
    }
    
    public String getDisplay(){
        return display;
    }
    
    public double getPrice(){
        return price;
    }
    
   
    @Override
    public String toString(){
        return display;
    }
 
}
