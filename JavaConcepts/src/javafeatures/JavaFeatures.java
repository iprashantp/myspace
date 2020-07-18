package javafeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * java8 features
 */
public class JavaFeatures {
    public static void main (String[] args) throws java.lang.Exception
    {
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<10;i++) arr.add(i);

        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::"+t);
            }
        };
        arr.forEach(c);

        MyConsumer cc = new MyConsumer();
        arr.forEach(cc);
    }
}
class MyConsumer implements Consumer<Integer>{
    @Override
    public void accept(Integer integer) {
        System.out.println("forEach anonymous class Value::"+integer);
    }
    @Override
    public Consumer<Integer> andThen(Consumer<? super Integer> after) {
        return null;
    }
}