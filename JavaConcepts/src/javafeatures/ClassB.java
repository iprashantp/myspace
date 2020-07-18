package javafeatures;

public interface ClassB {
    default void HelloB(){
        System.out.println("Hello A");
    }
}
