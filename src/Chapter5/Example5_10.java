package Chapter5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_10
 * Date: 2018-01-05
 * Time: 오전 11:26
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_10 {
    public Map<String,Integer> countWords(String passage, String... strings) {
        Map<String, Integer> wordCounts = new HashMap<>();
        Arrays.stream(strings).forEach(s -> wordCounts.put(s, 0));
        Arrays.stream(passage.split(" ")).forEach(word ->
                wordCounts.computeIfPresent(word, (key, val) -> val + 1));
        return wordCounts;
    }
}
