package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        this.author = anotherBook.author;
        this.title = anotherBook.title;
        this.id = anotherBook.id;
    }

    @Override
    public boolean equals(Object obj) {
        Book b = (Book)obj;
        if(this.id.equals(b.id) && this.title.equals(b.title) && this.author.equals(b.author))
        {
            return true;
        }
        return false;
    }
}
