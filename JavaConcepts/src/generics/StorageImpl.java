package generics;

public class StorageImpl<K,V,L> implements Storage{
    K key;
    V value;
    L lvalue;
    StorageImpl(K key, V value, L lvalue){
        this.key=key;
        this.value=value;
        this.lvalue = lvalue;
    }
    @Override
    public K getKey() {
        return this.key;
    }
    @Override
    public V getValue() {
        return this.value;
    }
    @Override
    public L getLValue() {
        return this.lvalue;
    }
}
