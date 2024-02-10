package org.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        Book book1 = new Book("Java Programming", 5, "978-0134685991");
        Book book2 = new Book("Python Basics", 3, "978-0135917411");
        library.addBook(book1);
        library.addBook(book2);

        // Creating members
        Member member1 = new Member("John",  1001);
        Member member2 = new Member("Alice",  1002);

        // Issuing books to members with due dates
        LocalDate dueDate1 = LocalDate.now().plusWeeks(2); // Due in 2 weeks
        LocalDate dueDate2 = LocalDate.now().plusWeeks(3); // Due in 3 weeks
        library.issueBook(book1, member1, dueDate1);
        library.issueBook(book2, member2, dueDate2);

        // Returning books by members
        LocalDate returnedDate1 = LocalDate.now().plusDays(20); // Returned after due date
        LocalDate returnedDate2 = LocalDate.now().plusDays(21); // Returned after due date
        library.returnBook(book1, member1, returnedDate1);
      //  library.returnBook(book2, member2, returnedDate2);

        // Displaying available books
        System.out.println("Available Books:");
        HashMap<String, Integer> availableBooks = library.getAvailableBooks();
        for (Map.Entry<String, Integer> entry : availableBooks.entrySet()) {
            System.out.println(entry.getKey() + " - Copies: " + entry.getValue());
        }

        // Displaying fines
        System.out.println("\nFines:");
        for (Map.Entry<Member, Integer> entry : library.getFineDue().getFines().entrySet()) {
            System.out.println("Member: " + entry.getKey().getName() + entry.getKey().getMemberID() + " - Fine Amount: $" + entry.getValue());
        }

    }
}