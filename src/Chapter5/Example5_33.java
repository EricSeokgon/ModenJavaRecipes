package Chapter5;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_33
 * Date: 2018-01-26
 * Time: 오전 8:42
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_33 {
    public List<Integer> div(List<Integer> values, Integer factor) {
        return values.stream()
                .map( n -> {
                    try {
                        return n / factor;
                    } catch (ArithmeticException e) {
                        e.printStackTrace();
                    }
                })
                .collect(Collectors.toList());
    }
}
