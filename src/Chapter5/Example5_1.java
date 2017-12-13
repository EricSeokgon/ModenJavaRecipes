package Chapter5;

import java.util.Arrays;
import java.util.List;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_1
 * Date: 2017-12-13
 * Time: 오전 9:08
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "this", null, "is", "a", null, "list", "of", "strings", null);
        List<String> nonNullStrings = strings.stream()
    }
}
