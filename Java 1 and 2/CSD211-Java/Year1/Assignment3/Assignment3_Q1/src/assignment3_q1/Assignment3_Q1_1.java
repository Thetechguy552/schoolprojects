package assignment3_q1;

/**
 * Jonathan Kelly
 * @author 15015608
 */
public class Assignment3_Q1 
{
   private static final Customer DEFAULT_CUSTOMER = new Customer();
    private static final Flight DEFAULT_FLIGHT = new Flight();
    private static final double DEFAULT_PRICE = 500.00;
    
    public static void main(String[] args) 
    {
        
        //Create Objects -------------------------------------------------------
        Customer John = new Customer("John Doe", "123 Main Street", 2112);
        Customer Jane = new Customer("Jane Doe", "456 First Street", 5150);
        
        Flight flightToToronto = new Flight(1, "Sault Ste Marie", "Toronto", "01/06/18 3:30 pm");
        Flight flightToSault = new Flight(2, "Timmins", "Sault Ste Marie", "01/09/18 7:30 am");
        
        AirlineTicket ticketTorontoFlight = new AirlineTicket(John, flightToToronto, 100.00);
        AirlineTicket ticketSaultFlight = new AirlineTicket(Jane, flightToSault, 150.00);
        
        //Test Objects ---------------------------------------------------------
        
        TestTicket.testCustomer(DEFAULT_CUSTOMER);
        TestTicket.testCustomer(John);
        TestTicket.testCustomer(Jane);
        
        TestTicket.testFlight(DEFAULT_FLIGHT);
        TestTicket.testFlight(flightToToronto);
        TestTicket.testFlight(flightToSault);
        
        TestTicket.testTicket(DEFAULT_CUSTOMER, DEFAULT_FLIGHT, DEFAULT_PRICE);
        TestTicket.testTicket(John, flightToToronto, 500.00);
        TestTicket.testTicket(Jane, flightToSault, 100.00);
        
        TestTicket.testTrip(ticketTorontoFlight);
        TestTicket.testTrip(ticketSaultFlight);
        
        System.out.println();
        TestTicket.testApplyPoints(ticketTorontoFlight);
        TestTicket.testApplyPoints(ticketSaultFlight);
        
    }
}
