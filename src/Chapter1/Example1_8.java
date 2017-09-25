package Chapter1;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example1_8
 * Date: 2017-09-15
 * Time: 오전 9:30
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example1_8 {
    public static void main(String[] args) {
        //Using a lambda expression
        Stream.of(3, 1, 4, 1, 5, 9).forEach(x -> System.out.println(x));
        //Using a method reference
        Stream.of(3, 1, 4, 1, 5, 9).forEach(System.out::println);
        //Assigning the method reference to a functional interface
        Consumer<Integer> printer = System.out::println;
        Stream.of(3, 1, 4, 1, 5, 9).forEach(printer);
    }
}
