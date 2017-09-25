package Chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_6
 * Date: 2017-09-25
 * Time: 오후 1:32
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_6 {
    public static void main(String[] args) {
        List<String> bradyBunch = Arrays.asList("Greg", "Marcia", "Peter", "Jan",
                "Bobby", "Cindy");
        String names = bradyBunch.stream()
                .collect(Collectors.joining(","));
        System.out.println(names);
    }
}
