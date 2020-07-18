package javafeatures;

public class DefaultInterfaces implements ClassA, ClassB {
    public static void main(String[] args) {
        ClassC c = (int i) -> {
            System.out.println("printer C :"+i);
            System.out.println("Multiple line C :"+i);
        };
        c.Hello();
        c.printer(3);
    }
}
