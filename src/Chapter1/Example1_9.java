package Chapter1;

import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example1_9
 * Date: 2017-09-15
 * Time: 오전 9:34
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example1_9 {
    public static void main(String[] args) {
        Stream.generate(Math::random) //Static method
                .limit(10)
                .forEach(System.out::println); //Instance method
    }
}
