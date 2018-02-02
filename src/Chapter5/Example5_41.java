package Chapter5;

import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Project: ModenJavaRecipes
 * FileName: Example5_41
 * Date: 2018-02-02
 * Time: 오전 9:18
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_41 {
    public List<String> encodeValuesWithWrapper(String... values) {
        return Arrays.stream(values)
                .map(Example5_40.wrapper(s -> URLEncoder.encode(s, "UTF-8")))
                .collect(Collectors.toList());
    }
}
