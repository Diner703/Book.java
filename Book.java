/*
 * Program: Book.java
 * Author: Devin DuBois
 * This is a program that creates a class called Book which contains 5 fields 
 * and 6 methods;
 * title, String, the title of the book.
 * author, String, the author of the book.
 * pages, integer, the number of pages in the book.
 * publisher, String, the publisher of the book.
 * year, integer, the year the book was published.
 * 6 methods
 * a constructor that accepts as arguments the values for the fields above, in the order listed.
 * a copy constructor that makes a copy of a Book object.
 * a getTitle method that returns the value of the title field.
 * a setAuthor method that accepts a String argument, which is used to set the author field.
 * an equals method that returns a boolean indicating if two objects contain 
 * the same information. If they do, it returns true, false otherwise. 
 * The objects contain the same information when their fields contain the same 
 * values.
 * a toString method that returns a String that contains on separate lines 
 * (5 lines), the names and values for each field.
 * The class will then be demonstrated in a demo program that;
 * create at least two Book objects.
 * create a copy of a Book object.
 * uses each of the other four methods to show they work properly. 
 */
package book;


public class Book 
{
    // Private Fields 
    private final String TITLE; // Title of the book
    private String AUTHOR; // Author of the book
    private final int PAGES; // The number of pages in the book
    private final String PUBLISHER; // The publisher of the book
    private final int YEAR; // The year the book was published
    Book book;
      
        
    /**
     * Constructor initializes values of the variables  
     * @param title_ Title of the book
     * @param author_ Author of the book
     * @param pages_ The number of pages in the book
     * @param publisher_ The publisher of the book
     * @param year_ The year the book was published
     */
    public Book(String title_, String author_, int pages_, String publisher_, int year_)
    {
     // Initialize variables   
     TITLE = title_; // Title of the book
     AUTHOR = author_; // Author of the book
     PAGES = pages_; // The number of pages in the book
     PUBLISHER = publisher_; // The publisher of the book
     YEAR = year_; // The year the book was published
    }
    
    /**
     * The copy constructor create a new book object initialize it the same data. 
     * @param book2 The copy of the book object 
     */
    public Book(Book book2)
    {   
     TITLE = book2.TITLE; // Title of the book
     AUTHOR = book2.AUTHOR; // Author of the book
     PAGES = book2.PAGES; // The number of pages in the book
     PUBLISHER = book2.PUBLISHER; // The publisher of the book
     YEAR = book2.YEAR; // The year the book was published
    }
    /**
     * The getTitle method returns the value of the title field
     * @return The title of the book
     */
    public String getTitle()
    {   
        // Return the title of the book
        return TITLE;
    }
    /**
     * The setAuthor method accepts a String argument which is used to set the author of the book.
     * @param author_  A String argument which is stored in the author field 
     */
    public void setAuthor(String author_)
    {
        AUTHOR = author_;
    }
    /**
     * The equals method to determine whether the objects are equal
     * @param book2 The second object to compare 
     * @return The true or false as the value of the status 
     */
    public boolean equals(Book book2)
    {  
       boolean status;
       
       // If statement to compare book objects
       if (this.book.equals(book2))
       {
          status = true;  
       }
       else
       {
          status = false;   
       }
       // Return true or false
       return status;  
    }
    
    /**
     * The toString method to create a string representing the method 
     * @return A string indicating the books title, author, pages, publisher, and year. 
     */
    
    public String toString()
    {
        String str = "Title: " + TITLE + "\n" + "Author: " + AUTHOR + "\n" +
                "Pages: " + PAGES + "\n" + "Publisher: " + PUBLISHER + "\n" + "Year: " + YEAR + "\n"; 
       
        // Return the string
        return str;
    }

   
    
    
    
    
    
    
    
}
