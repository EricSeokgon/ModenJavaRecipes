package Chapter5;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_7
 * Date: 2018-01-02
 * Time: 오전 8:33
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_7 {
    public static void main(String[] args) {
        Random r = new Random();
        r.ints(5)
                .sorted()
                .forEach(System.out::println);
        r.doubles(5, 0, 0.5)
                .sorted()
                .forEach(System.out::println);
        List<Long> longs = r.longs(5)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(longs);
        List<Integer> listOfInts = r.ints(5, 10, 20)
                .collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
        System.out.println(listOfInts);
    }
}
