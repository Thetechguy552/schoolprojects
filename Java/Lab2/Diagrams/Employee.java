package Lab2.Diagrams;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Employee extends Person {

    @ManyToOne(targetEntity = Department.class)
    private Department department;

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
