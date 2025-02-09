//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

// Custom Exception for Book Not Available
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Operation
class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}

// Library Class

// Main Class
public class LibraryApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library("Java Programming", "John Doe");

        while (true) {
            System.out.println("\nWelcome to Library Management System");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Check Book Availability");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Borrowing \"Java Programming\"");
                        library.borrowBook();
                        break;
                    case 2:
                        library.returnBook();
                        break;
                    case 3:
                        library.checkAvailability();
                        break;
                    case 4:
                        System.out.println("Exiting... Thank you!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                }
            } catch (BookNotAvailableException | InvalidOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
