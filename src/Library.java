public class Library {
    private String bookTitle;
    private String author;
    private boolean isAvailable;

    public Library(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.isAvailable = true; // Book is available initially
    }

    public void borrowBook() throws BookNotAvailableException {
        if (!isAvailable) {
            throw new BookNotAvailableException("Error: Book is currently not available for borrowing.");
        }
        isAvailable = false;
        System.out.println("Book borrowed successfully.");
    }

    public void returnBook() throws InvalidOperationException {
        if (isAvailable) {
            throw new InvalidOperationException("Error: Invalid operation! Book is already available.");
        }
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }

    public void checkAvailability() {
        System.out.println("Book Availability: " + (isAvailable ? "Available" : "Borrowed"));
    }
}
