package Chapter5;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_3
 * Date: 2017-12-20
 * Time: 오전 9:04
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_3 {
    public <T> List<T> getNonNullElements(List<T> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
