package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Library
{
    private HashMap<String, Integer> availableBooks;
    private List<Book> books;
    private FineDue fineDue;
    private HashSet<Member> registeredMembers;
    public Library() {
        availableBooks = new HashMap<>();
        books = new ArrayList<>();
        fineDue = new FineDue();
        registeredMembers  = new HashSet<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public FineDue getFineDue() {
        return fineDue;
    }

    public void addBook(Book b) {
        books.add(b);
        availableBooks.put(b.getName(), b.getCopies());
    }

    public HashMap<String, Integer> getAvailableBooks() {
        return availableBooks;
    }

    public void issueBook(Book b, Member m, LocalDate dueDate) {
        if(!registeredMembers.contains(m)){
            registerAsMember(m);
        }
        if (availableBooks.containsKey(b.getName()) && availableBooks.get(b.getName()) > 0) {
            m.getBooksCurrentlyHeld().add(b.getName());
            m.setOutStandingBooksToReturn(m.getOutStandingBooksToReturn()+1);
            availableBooks.put(b.getName(), availableBooks.get(b.getName()) - 1);
            fineDue.setDueDate(m.getMemberID(), dueDate);
            System.out.println("Book issued successfully to " + m.getName() + ". Due date: " + dueDate);
        } else {
            System.out.println("Sorry, the book is not available");
        }
    }

    private void registerAsMember(Member m) {
        registeredMembers.add(m);
    }

    public void returnBook(Book b, Member m, LocalDate returnedDate) {
        if(!registeredMembers.contains(m)){
            System.out.println("This person is not a member !!! Exiting...");
            return;
        }
        if (m.getBooksCurrentlyHeld().contains(b.getName())) {
            m.getBooksCurrentlyHeld().remove(b.getName());
            m.setOutStandingBooksToReturn(m.getOutStandingBooksToReturn()+1);
            availableBooks.put(b.getName(), availableBooks.get(b.getName()) + 1);
            LocalDate dueDate = fineDue.getDueDate(m.getMemberID());
            if (returnedDate.isAfter(dueDate)) {
                long daysOverdue = returnedDate.toEpochDay() - dueDate.toEpochDay();
                int fineAmount = (int) (daysOverdue * 0.5);
                fineDue.addFine(m.getName(), m.getMemberID(), fineAmount);
                System.out.println("Book returned successfully by " + m.getName() + ". Fine applied: $" + fineAmount);
            } else {
                System.out.println("Book returned successfully by " + m.getName());
            }
        } else {
            System.out.println("This book was not issued to " + m.getName());
        }
    }
}
