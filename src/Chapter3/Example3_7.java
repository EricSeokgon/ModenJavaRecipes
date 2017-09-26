package Chapter3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_7
 * Date: 2017-09-26
 * Time: 오전 9:37
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_7 {
    public static void main(String[] args) {
        List<Integer> ints = IntStream.range(10, 15)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(ints);
    }
}
