package Chapter3;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_65
 * Date: 2017-11-01
 * Time: 오전 9:10
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_65 {
    public static void main(String[] args) {
        OptionalInt firstEvenDoubleDivBy3 = IntStream.range(100, 200)
                .map(n -> n * 2)
                .filter(n -> n % 3 == 0)
                .findFirst();
        System.out.println(firstEvenDoubleDivBy3);
    }
}
