package Chapter5;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_28
 * Date: 2018-01-24
 * Time: 오전 8:35
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_31 {
    public List<Integer> div(List<Integer> values, Integer factor) {
        return values.stream()
                .map(n -> n / factor)
                .collect(Collectors.toList());
    }

}
