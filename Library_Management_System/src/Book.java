
public class Book {
	
	    private String title;
	    private String author;
	    private String isbn;

	    public Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	    }

	    // Getters and setters
	    public String getTitle() {
	     return title;
	    }
	    public String getAuthor() { 
	    	return author;
	    	}
	    public String getIsbn() {
	    	return isbn;
	    	}

	    @Override  //Returns a string representation of the object.
	    public String toString() {
	        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
	    }
	}


