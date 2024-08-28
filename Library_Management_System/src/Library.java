

	import java.util.ArrayList;
	import java.util.List;
	import java.io.*;

	public class Library {
	    private List<Book> books;
	    private final String FILE_NAME = "library.txt";

	    public Library() {
	        books = new ArrayList<>();
	        loadBooks();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	        saveBooks();
	    }

	    public Book searchByTitle(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                return book;
	            }
	        }
	        return null;
	    }

	    public Book searchByIsbn(String isbn) {
	        for (Book book : books) {
	            if (book.getIsbn().equalsIgnoreCase(isbn)) {
	                return book;
	            }
	        }
	        return null;
	    }

	    public void listAllBooks() {
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }

	    private void saveBooks() {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
	            for (Book book : books) {
	                writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getIsbn());
	                writer.newLine();
	            }
	        } catch (IOException e) {
	            System.out.println("Error saving books: " + e.getMessage());
	        }
	    }

	    private void loadBooks() {
	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(",");
	                if (parts.length == 3) {
	                    books.add(new Book(parts[0], parts[1], parts[2]));
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error loading books: " + e.getMessage());
	        }
	    }
	}
	
	
	
	
	
	
//	Package and Imports
//	java
//	Copy code
//	import java.util.ArrayList;
//	import java.util.List;
//	import java.io.*;
	
//	import java.util.ArrayList;: Imports the ArrayList class from the java.util package, which allows you to use dynamic arrays.
//	import java.util.List;: Imports the List interface from the java.util package, which is a part of Java's Collection framework.
//	import java.io.*;: Imports all classes from the java.io package, which includes classes for input and output operations like BufferedWriter, FileWriter, BufferedReader, and FileReader.

	//	Class Declaration
//	public class Library {
//	public class Library: Defines a public class named Library. This class will manage a collection of books, 
//	providing methods to add, search, list, save, and load books.

	//	Instance Variables
//	java
//	Copy code
//	    private List<Book> books;
//	    private final String FILE_NAME = "library.txt";
//	private List<Book> books;: Declares a private instance variable books of type List<Book>. 
//	This list will store objects of the Book class.
//	private final String FILE_NAME = "library.txt";: Declares a constant string FILE_NAME, 
//	which holds the name of the file where the books will be saved and loaded from. 
//	The final keyword indicates that this value cannot be changed once assigned.

	//	Constructor
//	java
//	Copy code
//	    public Library() {
//	        books = new ArrayList<>();
//	        loadBooks();
//	    }
//	public Library(): This is the constructor of the Library class. It is called when an instance of 
//	the Library class is created.
//	books = new ArrayList<>();: Initializes the books list as a new ArrayList. 
//	This means that when a Library object is created, it starts with an empty list of books.
//	loadBooks();: Calls the loadBooks() method to load any previously saved books from the file library.
//	txt into the books list.

	//	Method to Add a Book
//	java
//	Copy code
//	    public void addBook(Book book) {
//	        books.add(book);
//	        saveBooks();
//	    }
//	public void addBook(Book book): This method is used to add a new book to the library. 
//	It takes a Book object as a parameter.
//	books.add(book);: Adds the given Book object to the books list.
//	saveBooks();: Calls the saveBooks() method to save the updated list of books to the library.txt file. This ensures that the new book is persisted.

	//	Method to Search a Book by Title
//	java
//	Copy code
//	    public Book searchByTitle(String title) {
//	        for (Book book : books) {
//	            if (book.getTitle().equalsIgnoreCase(title)) {
//	                return book;
//	            }
//	        }
//	        return null;
//	    }
//	public Book searchByTitle(String title): This method searches for a book in the library by its title. 
//	It returns the Book object if found, or null if not.
//	for (Book book : books): Iterates through each Book object in the books list.
//	if (book.getTitle().equalsIgnoreCase(title)): Compares the title of the current Book object to the title passed to 
//	the method. The equalsIgnoreCase method checks for equality, ignoring case differences.
//	return book;: If a match is found, the method returns the Book object.
//	return null;: If no match is found after checking all books, the method returns null.

	//	Method to Search a Book by ISBN
//	java
//	Copy code
//	    public Book searchByIsbn(String isbn) {
//	        for (Book book : books) {
//	            if (book.getIsbn().equalsIgnoreCase(isbn)) {
//	                return book;
//	            }
//	        }
//	        return null;
//	    }
//	public Book searchByIsbn(String isbn): This method searches for a book in the library by its ISBN.
//	It returns the Book object if found, or null if not.
//	for (Book book : books): Iterates through each Book object in the books list.
//	if (book.getIsbn().equalsIgnoreCase(isbn)): Compares the ISBN of the current Book object to the ISBN passed to the method.
//	return book;: If a match is found, the method returns the Book object.
//	return null;: If no match is found, the method returns null.

	//	Method to List All Books
//	java
//	Copy code
//	    public void listAllBooks() {
//	        for (Book book : books) {
//	            System.out.println(book);
//	        }
//	    }
//	public void listAllBooks(): This method prints all the books in the library to the console.
//	for (Book book : books): Iterates through each Book object in the books list.
//	System.out.println(book);: Prints the Book object, which implicitly calls the toString() method 
//	of the Book class to format the output.

	//	Method to Save Books to a File
//	java
//	Copy code
//	    private void saveBooks() {
//	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
//	            for (Book book : books) {
//	                writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getIsbn());
//	                writer.newLine();
//	            }
//	        } catch (IOException e) {
//	            System.out.println("Error saving books: " + e.getMessage());
//	        }
//	    }
//	private void saveBooks(): This method saves the current list of books to a file (library.txt). 
//	It is a private method, meaning it can only be called within the Library class.
//	try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))): This is a try-with-resources statement that automatically closes the BufferedWriter after the try block. FileWriter opens the file in write mode, and BufferedWriter is used to write text efficiently.
//	for (Book book : books): Iterates through each Book object in the books list.
//	writer.write(book.getTitle() + "," + book.getAuthor() + "," + book.getIsbn());: Writes the title, author, and ISBN of the current book to the file, separated by commas.
//	writer.newLine();: Adds a new line after each book entry.
//	catch (IOException e): Catches any IOException that might occur during file operations.
//	System.out.println("Error saving books: " + e.getMessage());: Prints an error message if an exception occurs.

	//	Method to Load Books from a File
//	java
//	Copy code
//	    private void loadBooks() {
//	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
//	            String line;
//	            while ((line = reader.readLine()) != null) {
//	                String[] parts = line.split(",");
//	                if (parts.length == 3) {
//	                    books.add(new Book(parts[0], parts[1], parts[2]));
//	                }
//	            }
//	        } catch (IOException e) {
//	            System.out.println("Error loading books: " + e.getMessage());
//	        }
//	    }
//	private void loadBooks(): This method loads the list of books from the library.txt file into the books list. It is a private method.
//	try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))): Opens the file library.txt for reading. BufferedReader is used for efficient reading, and FileReader reads the file.
//	String line;: Declares a string variable line to hold each line of text from the file.
//	while ((line = reader.readLine()) != null): Reads each line from the file until the end of the file is reached (null is returned when there are no more lines).
//	String[] parts = line.split(",");: Splits each line into an array of strings using a comma as the delimiter. This assumes that each line contains the title, author, and ISBN separated by commas.
//	if (parts.length == 3): Checks if the line was successfully split into exactly three parts (title, author, and ISBN).
//	books.add(new Book(parts[0], parts[1], parts[2]));: Creates a new Book object using the split parts and adds it to the books list.
//	catch (IOException e): Catches any IOException that might occur during file operations.
//	System.out.println("Error loading books: " + e.getMessage());: Prints an error message if an exception occurs.

	
	//	Summary:
//	The Library class manages a collection of Book objects.
//	Books are stored in an ArrayList, and their details are persisted in a text file (library.txt).
//	The class provides methods to add
//
//
