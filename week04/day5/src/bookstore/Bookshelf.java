package bookstore;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    class BookShelf {

        List<Book> shelf;

        public BookShelf(){
            this.shelf = new ArrayList<>();
        }

        public void addNewBokk(Book book){
            shelf.add(book);
        }

        public String askAuthorOftheLightestBook(List<Book> shelf){
            int min = shelf.get(0).weight;
            String author = "";
            for(Book book : shelf){
                if(min < book.weight ){
                    min = book.weight;
                    author = book.author;
                }
            }
            return author;
        }

    }
