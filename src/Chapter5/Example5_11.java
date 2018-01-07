package Chapter5;

import java.util.Map;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_11
 * Date: 2018-01-08
 * Time: 오전 8:48
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_11 {
    private static Example5_10 demo;

    public static void main(String[] args) {

        String passage = "NSA agent walks into a bar. Bartender says, " +
                "'Hey, I have a new joke for you.' Agent says, 'heard it'.";

        
        Map<String, Integer> counts = demo.countWords(passage, "NSA", "agent", "joke");
        counts.forEach((word, count) -> System.out.println(word + "=" + count));
    }
}
