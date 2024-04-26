package BookClass;


import java.util.ArrayList;
import java.io.Serializable;
public class Book implements Serializable{

    // ATTRIBUTES
    private String title;

    private String description;
    private String imagePath;
    private String author;
    private String ISBN;
    private Genre genreType;
    private Status availability;
    private int copy;

    private Double totalFare;
    // Default constructor
    Book(String title, String author, String ISBN, Genre genreType, Status availability,
         String description,String imagePath) {
        // Initialize attributes with default values
        this(title, author, ISBN, genreType, availability, description);
        this.imagePath=imagePath;
    }
    Book(String title, String author, String ISBN, Genre genreType, Status availability,
         String description) {
        // Initialize attributes with default values
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genreType = genreType;
        this.availability = availability;
        this.copy = 1;
        this.description=description;
        this.imagePath= null;
    }

    public Book() {

    }
    // Getter methods

    public Double getTotalFare() {
        return totalFare;
    }
    public String getDescription() { return description;}
    public String getImagePath() {return imagePath;}
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public Genre getGenreType() {
        return genreType;
    }

    public Status getAvailability() {
        return availability;
    }

    public int getCopies() {
        return copy;
    }

    // Setter methods
    public void setTotalFare(Double totalFare){this.totalFare = totalFare;}
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setGenreType(Genre genreType) {
        this.genreType = genreType;
    }

    public void setAvailability(Status availability) {
        this.availability = availability;
    }
    public void setDescription(String description){this.description=description;}
    public void setImagePath(String imagePath){this.imagePath=imagePath;}
    public void setCopies(int copy) {
        // add copy
        this.copy += copy;
    }

    // Verify if ISBN is valid
    public static boolean verifyISBN(String ISBN) {

        int ISBNtype = 0;
        ISBN = ISBN.replaceAll("-", ""); // Remove hyphens from ISBN

        // Count the number of digits in the ISBN
        for (int i = 0; i < ISBN.length(); i++)
            if (Character.isDigit(ISBN.charAt(i)))
                ISBNtype++;

        if (ISBNtype == 10) {
            int sum = 0;

            // Verify the ISBN-10
            for (int i = 0; i < ISBN.length(); i++)
                if (Character.isDigit(ISBN.charAt(i)))
                    sum += (Integer.parseInt((ISBN.charAt(i) + "")) * (10 - i));

            return sum % 11 == 0;
        } else if (ISBNtype == 13) {

            int sum = 0;

            // Verify the ISBN-13
            for (int i = 0; i < ISBN.length(); i++)
                if (Character.isDigit(ISBN.charAt(i)))
                    sum += (Integer.parseInt(ISBN.charAt(i) + "") * ((i % 2 == 0) ? 1 : 3));

            return sum % 10 == 0;
        } else
            return false;
    }

    // Method to delete a book
    public static void deleteBook(Book book) throws Throwable {
        book = null; // Deleting reference to the book, book itself won't be deleted by this
    }

    // Override equals method to compare books based on ISBN
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass())
            return false;

        Book book = (Book) o;

        return this.getISBN().equals(((Book) o).getISBN());
    }

    // Override toString method to represent Book object as a String
    @Override
    public String toString() {
        return String.format("Title: %s\n" +
                        "String: %s\n" +
                        "ISBN: %s\n" +
                        "Genre: %s\n" +
                        "Availability: %s\n" +
                        "Copies: %d",
                this.getTitle(),
                this.getAuthor(),
                this.getISBN(),
                this.getGenreType(),
                this.getAvailability(),
                this.getCopies());

    }
}
