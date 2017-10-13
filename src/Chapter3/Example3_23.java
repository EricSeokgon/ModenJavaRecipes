package Chapter3;

import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_23
 * Date: 2017-10-13
 * Time: 오전 9:07
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_23 {
    public static void main(String[] args) {
        String s = Stream.of("this", "is", "a", "list")
                .reduce("", String::concat);
        System.out.println(s);
    }
}
