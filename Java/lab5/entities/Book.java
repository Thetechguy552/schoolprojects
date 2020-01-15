package lab5.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class Book extends Publication {

    @Basic
    private String author;

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
