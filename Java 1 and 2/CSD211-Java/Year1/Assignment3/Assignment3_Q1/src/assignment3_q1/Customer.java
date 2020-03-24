package assignment3_q1;
/**
 * Jonathan Kelly
 * @author 15015608
 */
public class Customer 
{
    
    private String name, address;
    private int membershipNumber, membershipPoints;
    
    public Customer()
    {
        this.name = "No Name";
        this.address = "No Address";
        this.membershipNumber = 0;
        this.membershipPoints = 0;
    }
    
    public Customer(String name, String address, int membershipNumber)
    {
        this.name = name;
        this.address = address;
        this.membershipNumber = membershipNumber;
        this.membershipPoints = 0;
    }
    
    public String getCustomerName()
    {
        return this.name;
    }
    
    public String getCustomerAddress()
    {
        return this.address;
    }
    
    public int getCustomerMembershipNumber()
    {
        return this.membershipNumber;
    }
    
    public int getCustomerMembershipPoints()
    {
        return this.membershipPoints;
    }
    
    protected void setCustomerName(String name)
    {
        this.name = name;
    }
    
    protected void setCustomerAddress(String address)
    {
        this.address = address;
    }
    
    protected void setCustomerMembershipNumber(int membershipNumber)
    {
        this.membershipNumber = membershipNumber;
    }
    
    protected void setCustomerMembershipPoints(int membershipPoints)
    {
        this.membershipPoints = membershipPoints;
    }
    
    protected int applyPoints(AirlineTicket ticket){
        return this.membershipPoints += (Math.round(ticket.getPrice() / 100));
    }
    
    @Override
    public String toString()
    {
        return  "\nName: " + getCustomerName() + "\n"
                + "Address: " + getCustomerAddress() + "\n"
                + "Membership Number: " + getCustomerMembershipNumber() + "\n"
                + "Membership Points: " + getCustomerMembershipPoints();
    }
}
