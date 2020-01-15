/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author Jonathan Kelly
 */
public class Main {

    private static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creates new book object
        Lab4.Book book = new Lab4.Book();
        //Prints out new book
        System.out.println(book);
        int choice = 0;
        boolean done = false;

        while (!done) {
            try {
                System.out.println("---------Books----------");

                System.out.println("------------------------");
                System.out.println("1. Add Book");
                System.out.println("2. Edit Book");
                System.out.println("3. Delete Book");
                System.out.println("99. Quit");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        Add();
                        break;
                    case 2:
                        Edit();
                        break;
                    case 3:
                        Delete();
                        break;
                    case 99:
                        done = true;
                        break;
                    default:
                        System.out.println("Wrong entry try again.");
                }
            } catch (Exception e) {
                System.out.println("Wrong entry try again.");
                input.next();
            }
        }
    }

    private static void Add() {
        System.out.println("---------Add Book----------");
        System.out.println("Enter Author ");
        Book book = new Book();

        System.out.println("Quantity to Order:");

        System.out.println("Title:");

        System.out.println("Price: ");

    }

    private static void Edit() {
        System.out.println("---------Edit Book----------");
        System.out.println("Enter Book Name ");

    }

    private static void Delete() {
        System.out.println("---------Delete book----------");
        System.out.println("Enter Book Name ");

    }
}