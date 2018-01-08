package Chapter5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_12
 * Date: 2018-01-09
 * Time: 오전 8:37
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_12 {
    public Map<String, Integer> fullWordCounts(String passage) {
        Map<String, Integer> wordCounts = new HashMap<>();
        String testString = passage.toLowerCase().replaceAll("\\W"," ");
        Arrays.stream(testString.split("\\s+")).forEach(word ->
                wordCounts.merge(word, 1, Integer::sum));
        return wordCounts;
    }
}
