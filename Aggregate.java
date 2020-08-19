/**
 * 集合体を表すインタフェース
 * Iterator（私が持っている要素を順番にスキャンしてくれる人）を作り出すインターフェース（API）を定める。
 */
public interface Aggregate {
    public abstract Iterator iterator();
}