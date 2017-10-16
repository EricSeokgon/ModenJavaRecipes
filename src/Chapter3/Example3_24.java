package Chapter3;

import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_24
 * Date: 2017-10-16
 * Time: 오전 9:06
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_24 {
    public static void main(String[] args) {
        String s = Stream.of("this", "is", "a", "list")
                .collect(() -> new StringBuilder(),
                        (sb, str) -> sb.append(str),
                        (sb1, sb2) -> sb1.append(sb2))
                .toString();
    }
}
