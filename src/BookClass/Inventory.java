package BookClass;

import UserClass.*;

import java.io.*;
import java.util.ArrayList;

public class Inventory{
    // ATTRIBUTES

    private static ArrayList<Book> books = new ArrayList<>();

    private static ArrayList<Borrow> borrowedBooks = new ArrayList<>();

    private static ArrayList<Customer> customers = new ArrayList<>();

    public static void initInventory()
    {
        // TODO : File handling for everything
        /*try {
            FileInputStream reader= new FileInputStream("books.txt");
            ObjectInputStream bookFile = new ObjectInputStream(reader);

            books = (ArrayList<Book>) bookFile.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/
        try{
            FileInputStream customerReader= new FileInputStream("./customers.txt");
            ObjectInputStream customerFile = new ObjectInputStream(customerReader);

            customers = (ArrayList<Customer>)customerFile.readObject();
            System.out.println("DONE WRITING CUSTOMERS");
            for(Customer c: customers){
                System.out.println(c.getUsername() + " " + c.getEmail());
            }
        } catch (IOException | ClassNotFoundException ioe){
            throw new RuntimeException(ioe);
        }


    }
    public static ArrayList<Book> getBooks() {
        return books;
    }
    public static ArrayList<Borrow> getBorrowedBooks() {
        return borrowedBooks;
    }
    public static ArrayList<Customer> getCustomers() {
        return customers;
    }
}
