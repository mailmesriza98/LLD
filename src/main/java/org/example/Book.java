package org.example;

public class Book {
    private String name;
    private int copies;

    private String isbn;
    private int favorites;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getFavorites() {
        return favorites;
    }

    public void setFavorites(int favorites) {
        this.favorites = favorites;
    }

    public Book(String name, int copies, String isbn) {
        this.name = name;
        this.copies = copies;
        this.isbn = isbn;
        this.favorites = 0;
    }
}
