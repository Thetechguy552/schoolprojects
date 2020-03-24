package assignment3_q1;

/**
 * Jonathan Kelly
 * @author 15015608
 */
public class TestTicket {
        public TestTicket(){    
    }
    
    static void testCustomer(Customer customer)
    {
        System.out.println(customer);
    }
    
    static void testApplyPoints(AirlineTicket ticket)
    {
        System.out.println("Points Increased By: " + ticket.getCustomer().applyPoints(ticket));
    }
    
    static void testFlight(Flight flight)
    {
        System.out.println(flight);
    }
    
    static void testTicket(Customer customer, Flight flight, double price)
    {
        System.out.println(new AirlineTicket(customer, flight, price));
    }
    
    static void testTrip(AirlineTicket ticket)
    {
        System.out.println(ticket);
    }
}
