package org.example.model;

public record Book(int id, String title, Author author, String genre, long isbn) {
    public boolean getTitle() {
        return false;
    }
}
