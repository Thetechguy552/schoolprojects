package assignment3_q1;

/**
 * Jonathan Kelly
 * @author 15015608
 */
public class Flight 
{
    private int flightNumber;
    private String origin, destination, departureTime;
    
    public Flight()
    {
        this.flightNumber = 0;
        this.origin = "No Origin";
        this.destination = "No Destination";
        this.departureTime = "No Departure Time";
    }
    
    public Flight(int flightNumber, String origin, String destination, String departureTime)
    {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
    }
    
    public int getFlightNumber()
    {
        return this.flightNumber;
    }
    
    public String getOrigin()
    {
        return this.origin;
    }
    
    public String getDestination()
    {
        return this.destination;
    }
    
    public String getDepartureTime()
    {
        return this.departureTime;
    }
    
    protected void setFlightNumber(int flightNumber)
    {
        this.flightNumber = flightNumber;
    }
    
    protected void setOrigin(String origin)
    {
        this.origin = origin;
    }
    
    protected void setDestination(String destination)
    {
        this.destination = destination;
    }
    
    protected void setDepartureTime(String departureTime)
    {
        this.departureTime = departureTime;
    }
   
    @Override
    public String toString()
    {
        return  "\nFlight Number: " + getFlightNumber() + "\n" 
                + "Flight Origin: " + getOrigin() + "\n" 
                + "Flight Destination: " + getDestination() + "\n" 
                + "Departure Time: " + getDepartureTime();
    }
}
