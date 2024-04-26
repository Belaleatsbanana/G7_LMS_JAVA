import BookClass.Inventory;
import UserClass.Customer;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class test {

    public static void main(String[] args) {


            // Create a new customer and add it to the ArrayList


//            try {
//                // Print customer details for debugging
//
//
//                // Write the ArrayList to the file
//                FileOutputStream fos = new FileOutputStream("books.txt");
//                ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//                oos.close();
//                fos.close();
//                System.out.println("ArrayList of customers has been written to the file.");
//
//                // Open the file for reading
//                FileInputStream fis = new FileInputStream("customers.txt");
//                ObjectInputStream ois = new ObjectInputStream(fis);
//
//                // Read the ArrayList from the file and print its elements
//                ArrayList<Customer> readCustomers = (ArrayList<Customer>) ois.readObject();
//                for (Customer c : readCustomers) {
//                    System.out.println("Read from file: " + c.getUsername() + " " + c.getEmail());
//                }
//
//                ois.close();
//                fis.close();
//
//            } catch (IOException | ClassNotFoundException e) {
//                System.out.println("Error: " + e.getMessage());
//            }

    }
}
