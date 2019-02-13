package bookstore;

public class HardcoverBook extends  Book {

    public HardcoverBook(String name , String author, int relaseYear, int pageNumber){
        super(name,author,relaseYear,pageNumber);
        this.weight = 100 + (pageNumber * 10);
    }
}

