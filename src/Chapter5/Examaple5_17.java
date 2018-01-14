package Chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Project: ModenJavaRecipes
 * FileName: Examaple5_17
 * Date: 2018-01-15
 * Time: 오전 8:45
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Examaple5_17 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 1, 4, 1, 5, 9);
        integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        integers.forEach((Integer n) -> {
            System.out.println(n);
        });
        integers.forEach(n -> System.out.println(n));
        integers.forEach(System.out::println);
    }
}
