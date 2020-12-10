/*
 * Program: BookTest.java
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


public class BookDemo
{
    public static void main(String[] args)
    {  
      
      
       // Create a book object
       Book book1 = new Book("Starting out with Java", "Tony Gaddis", 1370, "Pearson", 2019);
       
       // The second copy of the book object
       Book book2 = new Book(book1);
       
       // The third copy of the book object
       Book book3 = new Book(book1);
       
       
       //Display the books
       System.out.println(book1);
       System.out.println(book2);
        System.out.println(book3);
       System.out.println("");
        
       // If statment to compare the two objects 
       if (book1.equals(book2))
       {
           System.out.println("True");   
       }
       else
       {
           System.out.println("False");   
       }
           
    }
}
