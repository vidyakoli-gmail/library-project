package project2;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();

        while (true) {
            System.out.println("\n1. Admin Login");
            System.out.println("2. Librarian Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    adminMenu(admin, scanner);
                    break;
                case 2:
                    librarianMenu(admin, scanner);
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void adminMenu(Admin admin, Scanner scanner) {
        while (true) {
            System.out.println("\nAdmin Menu");
            System.out.println("1. Add Librarian");
            System.out.println("2. View Librarians");
            System.out.println("3. Delete Librarian");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Librarian ID: ");
                    String librarianId = scanner.next();
                    System.out.print("Enter Librarian Name: ");
                    String librarianName = scanner.next();
                    admin.addLibrarian(new Librarian(librarianId, librarianName));
                    break;
                case 2:
                    admin.viewLibrarians();
                    break;
                case 3:
                    System.out.print("Enter Librarian ID to delete: ");
                    String deleteId = scanner.next();
                    admin.deleteLibrarian(deleteId);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void librarianMenu(Admin admin, Scanner scanner) {
        System.out.print("Enter Librarian ID: ");
        String librarianId = scanner.next();
        Librarian librarian = admin.getLibrarian(librarianId);

        if (librarian == null) {
            System.out.println("Invalid Librarian ID!");
            return;
        }

        while (true) {
            System.out.println("\nLibrarian Menu");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. View Issued Books");
            System.out.println("5. Return Book");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.next();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.next();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.next();
                    librarian.addBook(new Book(bookId, title, author));
                    break;
                case 2:
                    librarian.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    String issueId = scanner.next();
                    librarian.issueBook(issueId);
                    break;
                case 4:
                    librarian.viewIssuedBooks();
                    break;
                case 5:
                    System.out.print("Enter Book ID to return: ");
                    String returnId = scanner.next();
                    librarian.returnBook(returnId);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

	