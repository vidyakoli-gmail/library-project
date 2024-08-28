package project2;


import java.util.ArrayList;
import java.util.List;

class Admin {
    private List<Librarian> librarians = new ArrayList<>();

    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
        System.out.println("Librarian added successfully.");
    }

    public void viewLibrarians() {
        for (Librarian librarian : librarians) {
            System.out.println("Librarian ID: " + librarian.getLibrarianId() + ", Name: " + librarian.getName());
        }
    }

    public void deleteLibrarian(String librarianId) {
        librarians.removeIf(librarian -> librarian.getLibrarianId().equals(librarianId));
        System.out.println("Librarian deleted successfully.");
    }

    // Add this method to retrieve a librarian by ID
    public Librarian getLibrarian(String librarianId) {
        for (Librarian librarian : librarians) {
            if (librarian.getLibrarianId().equals(librarianId)) {
                return librarian;
            }
        }
        return null; // Return null if no librarian with the given ID is found
    }
}
