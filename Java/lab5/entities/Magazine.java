package lab5.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class Magazine extends Publication {

    @Basic
    private int orderQty;

    public int getOrderQty() {
        return this.orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

}
