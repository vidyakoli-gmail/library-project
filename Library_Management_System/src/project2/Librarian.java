package project2;


	import java.util.ArrayList;
	import java.util.List;

	public class Librarian {
	    private String librarianId;
	    private String name;
	    private List<Book> books = new ArrayList<>();

	    public Librarian(String librarianId, String name) {
	        this.librarianId = librarianId;
	        this.name = name;
	    }

	    public String getLibrarianId() {
	        return librarianId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public void viewBooks() {
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }

	    public void issueBook(String bookId) {
	        for (Book book : books) {
	            if (book.getBookId().equals(bookId) && !book.isIssued()) {
	                book.setIssued(true);
	                System.out.println("Book issued successfully.");
	                return;
	            }
	        }
	        System.out.println("Book not available or already issued.");
	    }

	    public void viewIssuedBooks() {
	        for (Book book : books) {
	            if (book.isIssued()) {
	                System.out.println(book);
	            }
	        }
	    }

	    public void returnBook(String bookId) {
	        for (Book book : books) {
	            if (book.getBookId().equals(bookId) && book.isIssued()) {
	                book.setIssued(false);
	                System.out.println("Book returned successfully.");
	                return;
	            }
	        }
	        System.out.println("Invalid Book ID or Book not issued.");
	    }
	}



