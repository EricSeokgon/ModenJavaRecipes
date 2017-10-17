package Chapter3;

import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_25
 * Date: 2017-10-17
 * Time: 오전 9:06
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_25 {
    public static void main(String[] args) {
        String s = Stream.of("this", "is", "a", "list")
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append)
                .toString();
    }
}
