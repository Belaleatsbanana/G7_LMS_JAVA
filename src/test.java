import UserClass.Customer;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        // Perform the process three times
        for (int i = 0; i < 3; i++) {
            // Create a new ArrayList to store customers
            ArrayList<Customer> customers = new ArrayList<>();

            // Create a new customer and add it to the ArrayList
            Customer customer = new Customer("John" + i, "john" + i + "@example.com", "password" + i,
                    "Male", "123456789", "1234", LocalDate.now());
            customers.add(customer);

            try {
                // Print customer details for debugging
                System.out.println("Customer to write: " + customer.getUsername() + " " + customer.getEmail());

                // Write the ArrayList to the file
                FileOutputStream fos = new FileOutputStream("customers.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(customers);
                oos.close();
                fos.close();
                System.out.println("ArrayList of customers has been written to the file.");

                // Open the file for reading
                FileInputStream fis = new FileInputStream("customers.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);

                // Read the ArrayList from the file and print its elements
                ArrayList<Customer> readCustomers = (ArrayList<Customer>) ois.readObject();
                for (Customer c : readCustomers) {
                    System.out.println("Read from file: " + c.getUsername() + " " + c.getEmail());
                }

                ois.close();
                fis.close();

            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
