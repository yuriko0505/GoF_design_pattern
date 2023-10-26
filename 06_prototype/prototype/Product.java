package prototype;

public interface Product extends Cloneable {
    public abstract void use(String s);
    /*
     * cloneメソッド自体は全てのクラスがprotectedメソッドとして持っている。
     * Clonableはマーカーメソッドと呼ばれる
     */
    public abstract Product createClone();
}