/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author Jonathan Kelly
 */
public class Book extends Publication {
    private String author;

    public Book() {
    }

    public Book(String title, String author, Integer price, Integer copies) {
        super(title, price, copies);
        this.author = author;
    }
    
    public void orderCopies(int num2Order){
        setCopies(num2Order+getCopies());
    }
    
}
