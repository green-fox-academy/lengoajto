package bookstore;

public class Book {

    String tiltle;
    String author;
    int relaseYear;
    int pageNumber;
    int weight;

    public Book(String tiltle, String author, int relaseYear, int pageNumber) {
        this.tiltle = tiltle;
        this.author = author;
        this.relaseYear = relaseYear;
        this.pageNumber = pageNumber;
    }

    public String giveBookiInformation(){
        String info = "Author: " + author +  " title: " + tiltle + " year: " + relaseYear;
        return info;
    }
}

