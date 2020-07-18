package javafeatures;

public interface ClassC {
    default void Hello(){
        System.out.println("Hello C");
    }
    abstract void printer(int i);
    //abstract void printer2(int i);
}
