package javafeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> lis = new ArrayList<Integer>();
        for(int i=0;i<10;i++) lis.add(i);

        Stream<Integer> seqStream  = lis.stream();
        Stream<Integer> parallelStream = lis.parallelStream();

        System.out.println("Parellel");
        Stream<Integer> higherP = seqStream.filter(p->p>5);
        higherP.forEach(p-> System.out.println(p));

        System.out.println("sequential");
        Stream<Integer> higherS = parallelStream.filter(p -> p>5);
        higherS.forEach(p-> System.out.println(p));
    }
}
