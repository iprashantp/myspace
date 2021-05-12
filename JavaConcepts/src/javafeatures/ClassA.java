package javafeatures;

public interface ClassA {
    default void Hello(){
        System.out.println("Hello A");
    }
}
