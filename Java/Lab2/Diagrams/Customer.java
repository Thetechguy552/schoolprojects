package Lab2.Diagrams;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Customer extends Person {

    @ManyToOne(targetEntity = Employee.class)
    private Employee primaryContact;

    @OneToMany(targetEntity = ProductOrder.class)
    private Collection<ProductOrder> productOrders;

    public Employee getPrimaryContact() {
        return this.primaryContact;
    }

    public void setPrimaryContact(Employee primaryContact) {
        this.primaryContact = primaryContact;
    }

    public Collection<ProductOrder> getProductOrders() {
        return this.productOrders;
    }

    public void setProductOrders(Collection<ProductOrder> productOrders) {
        this.productOrders = productOrders;
    }

}
