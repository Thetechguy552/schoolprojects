package assignment3_q1;
import java.text.DecimalFormat;

/**
 * Jonathan Kelly
 * @author 15015608
 */
public class AirlineTicket 
{  
    private Customer customer;
    private Flight flight;
    private double price;
    public AirlineTicket(){   
    }
    
    public AirlineTicket(Customer customer, Flight flight, double price)
    {
        this.customer = customer;
        this.flight = flight;
        this.price = price;
    }
        
    public Customer getCustomer()
    {
        return this.customer;
    }
    
    public Flight getFlight()
    {
        return this.flight;
    }
    
    public double getPrice()
    {
        return this.price;
    }  
    
    protected void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    protected void setFlight(Flight flight)
    {
        this.flight = flight;
    }
    
    protected void setPrice(double price)
    {
        this.price = price;
    }
    
    @Override
    public String toString()
    {
        DecimalFormat formatter = new DecimalFormat("0.00");
        return  "\nCustomer Name: " + getCustomer().getCustomerName()
                + getFlight()
                + "\nPrice: " + "$" + formatter.format(getPrice());
    }
}
