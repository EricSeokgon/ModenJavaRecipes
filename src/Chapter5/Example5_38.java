package Chapter5;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_35
 * Date: 2018-01-29
 * Time: 오전 8:44
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_38 {
    private String encodeString(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    public List<String> encodeValuesUsingMethod(String... values) {
        return Arrays.stream(values)
                .map(this::encodeString)
                .collect(Collectors.toList());
    }
}
