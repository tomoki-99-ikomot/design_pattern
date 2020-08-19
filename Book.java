/**
 * 本を表すクラス
 * ConcreteAggregateに該当するBookShelfクラスの集約関係にある
 */
public class Book {
    private String name;
    public Book(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}