package Chapter5;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_18
 * Date: 2018-01-16
 * Time: 오전 8:49
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_18 {
    public static void main(String[] args) {
        Map<Long, String> map = new HashMap<>();
        map.put(86L, "Don Adams (Maxwell Smart)");
        map.put(99L, "Barbara Feldon");
        map.put(13L, "David Ketchum");
        map.forEach((num, agent) ->
                System.out.printf("Agent %d, played by %s%n", num, agent));
    }
}
