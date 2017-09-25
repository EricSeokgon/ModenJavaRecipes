package Chapter3;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_3
 * Date: 2017-09-25
 * Time: 오전 9:12
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_3 {
    public static void main(String[] args) {
        String[] munsters = { "Herman", "Lily", "Eddie", "Marilyn", "Grandpa" };
        String names = Arrays.stream(munsters)
                .collect(Collectors.joining(","));
        System.out.println(names);
    }
}
