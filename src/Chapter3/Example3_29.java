package Chapter3;

import java.math.BigDecimal;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: psvm
 * Date: 2017-10-18
 * Time: 오전 9:12
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_29 {
    public static void main(String[] args) {
        BigDecimal total = Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE))
                .limit(10)
                .reduce(BigDecimal.ZERO, (acc, val) -> acc.add(val));
        System.out.println("The total is " + total);
    }
}
