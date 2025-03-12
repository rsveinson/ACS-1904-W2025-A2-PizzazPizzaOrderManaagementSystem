
/**
 * ACS-1904 W2023
 * Assignment 2
 * Enum: pizza sizes, prices, and topping prices
 */
public enum Size
{
    SMALL(11, "Small", 13.0, 0.25),
    MEDIUM(13, "Medium", 15.0, 0.35), 
    LARGE(15, "Large", 17.0, 0.5),
    JUMBO(22, "Jumbo", 19.0, 0.75);
            
    private int diameter;
    private String display;
    private double basePrice;
    private double pricePerTopping;
      
    // constructor
    private Size(int d, String n, double bp, double ppt){
        diameter = d;
        display = n;
        basePrice = bp;
        pricePerTopping = ppt;
    }
    
    public int getDiameter(){
        return this.diameter;
    }
    
    public double getBasePrice(){
        return this.basePrice;
    }
    
    public double getPricePerTopping(){
        return this.pricePerTopping;
    }
    
    public String getDisplay(){
        return display;
    }
   
    @Override
    public String toString(){
        return display;
    }
}// end size
