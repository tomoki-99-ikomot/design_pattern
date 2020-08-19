/**
 * 本棚を表すクラス
 * ConcreteAggregate（具体的な集合体）に該当し、Aggregate(集合体）を実装する。
 * 具体的なIteratorつまりConcreteIteratorに該当するBookShelfIteratorのインスタンスを作り出す。
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }
    public Book getBookAt(int index) {
        return books[index];
    }
    public void apendBook(Book book) {
        this.books[last] = book;
        last++;
    }
    public int getLength() {
        return last;
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
