package Chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_12
 * Date: 2017-09-26
 * Time: 오전 11:20
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_12 {
    public static void main(String[] args) {
        List<Integer> ints = IntStream.of(3, 1, 4, 1, 5, 9)
                .collect(ArrayList<Integer>::new, ArrayList::add, ArrayList::addAll);
    }
}
