

	import java.util.Scanner;

	public class LibraryApp {
	    private static Library library = new Library();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("Library Management System");
	            System.out.println("1. Add Book");
	            System.out.println("2. Search Book by Title");
	            System.out.println("3. Search Book by ISBN");
	            System.out.println("4. List All Books");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter author: ");
	                    String author = scanner.nextLine();
	                    System.out.print("Enter ISBN: ");
	                    String isbn = scanner.nextLine();
	                    library.addBook(new Book(title, author, isbn));
	                    System.out.println("Book added!");
	                    break;
	                case 2:
	                    System.out.print("Enter title: ");
	                    title = scanner.nextLine();
	                    Book bookByTitle = library.searchByTitle(title);
	                    if (bookByTitle != null) {
	                        System.out.println(bookByTitle);
	                    } else {
	                        System.out.println("Book not found!");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter ISBN: ");
	                    isbn = scanner.nextLine();
	                    Book bookByIsbn = library.searchByIsbn(isbn);
	                    if (bookByIsbn != null) {
	                        System.out.println(bookByIsbn);
	                    } else {
	                        System.out.println("Book not found!");
	                    }
	                    break;
	                case 4:
	                    library.listAllBooks();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}


