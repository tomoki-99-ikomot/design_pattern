/**
 * 反復子の役割。
 * 要素を順番にスキャンしていくインターフェース（API）を定める。
 * hasNext()：次の要素が存在するか
 * next()：次の要素を得る
 * などを定義する。
 */
public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}