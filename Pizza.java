/** 
 * ACS-1904 Assignment 2
 * @Sveinson
 */

public abstract class Pizza{

    // fields
    protected double price;
    
    /* not called for in the specs but
     * this is the association field
     * since a pizza can be associatied
     * with only one order
     */
    protected Order order;


    // constructors
    public Pizza(){
        //price = 0;
        order = null;
    }

    
    // abstract method must be implemented in derived classes
    public abstract double calculatePizzaPrice();

    // getters
    public double getPrice(){
        return price;
    }

    // setters
    // public void setPrice(double p){
        // price = p;
    // }
    
    public void setOrder(Order o){
        this.order = o;
    }
    
    public Order getOrder(){
        return order;
    }

    // other

}
/*****************************************
 * Description: brief description of the methods purpose
 * 
 * @param        each parameter of the method should be listed with an @param
 * @param        parametername description of parameter
 * 
 * @return       any return value will be noted here
 * ****************************************/
