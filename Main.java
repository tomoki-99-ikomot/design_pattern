/**
 * 実行クラス
 */
public class Main {
    public static void main(String args[]) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.apendBook(new Book("Around the World in 80 Days"));
        bookShelf.apendBook(new Book("Bible"));
        bookShelf.apendBook(new Book("Cinderella"));
        bookShelf.apendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}