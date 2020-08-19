/**
 * 本棚をスキャンするクラス
 * ConcreteIterator（具体的な反復子）に該当し、Iteratorを実装する。
 * スキャンするために必要な情報（集合体の実体や注目している要素のインデックスなど）を持つ。
 * 集合体の実体（ConcreteAggregateに該当するBookShelfインスタンス）を持っているため、
 * その内容を把握しており、そのメソッドなどを利用できる。
 * （ConcreteAggregateの実装を変更した場合は、ConcreteIteratorの実装の見直しが必要になる）
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}