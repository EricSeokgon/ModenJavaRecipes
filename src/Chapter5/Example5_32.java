package Chapter5;

import java.util.Arrays;
import java.util.List;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_32
 * Date: 2018-01-25
 * Time: 오전 8:47
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_32 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(30, 10, 40, 10, 50, 90);
        Example5_31 demo = new Example5_31();
        List<Integer> scaled = demo.div(values, 10);
        System.out.println(scaled);
// prints: [3, 1, 4, 1, 5, 9]
        scaled = demo.div(values, 0);
        System.out.println(scaled);
// throws ArithmeticException: / by zero
    }
}
