package example_1;

import java.util.Arrays;
import java.util.List;

/**
 * Project: ModenJavaRecipes
 * FileName: Example1_27
 * Date: 2017-09-19
 * Time: 오전 11:36
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example1_27 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 1, 4, 1, 5, 9);
        boolean removed = nums.removeIf(n -> n <= 0);
        System.out.println("Elements were " + (removed ? "" : "NOT") + " removed");
        nums.forEach(System.out::println);
    }
}
