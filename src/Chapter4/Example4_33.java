package Chapter4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_33
 * Date: 2017-12-08
 * Time: 오후 1:06
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_33 {
    public static void main(String[] args) {
        Map<String, Integer> map = Collections.unmodifiableMap(
                new HashMap<String, Integer>() {{
                    put("have", 1);
                    put("the", 2);
                    put("high", 3);
                    put("ground", 4);
                }});
    }
}
