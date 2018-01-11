package Chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_17
 * Date: 2018-01-12
 * Time: 오전 8:46
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_17 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 1, 4, 1, 5, 9);
        integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}
