package iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("book 1"));
        bookShelf.appendBook(new Book("book 2"));
        bookShelf.appendBook(new Book("book 3"));
        bookShelf.appendBook(new Book("book 4"));

        Iterator it = bookShelf.iterator();
        while(it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
