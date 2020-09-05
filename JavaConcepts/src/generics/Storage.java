package generics;

public interface Storage <K,V,L>  {
    public K getKey();
    public V getValue();
    public L getLValue();
}
