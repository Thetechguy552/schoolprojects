package Lab2.Diagrams;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Basic
    private String city;

    @Basic
    private String street;

    @Basic
    private String state;

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
