package bookstore;

class PaperbackBook extends Book {

    public PaperbackBook(String name , String author, int relaseYear, int pageNumber){
        super(name,author,relaseYear,pageNumber);
        this.weight = 20 + ( pageNumber * 10);
    }


}
