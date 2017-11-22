package Chapter4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_19
 * Date: 2017-11-22
 * Time: 오전 9:13
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_19 {
    private static Path dictionary;

    public static void main(String[] args) {
        System.out.println("\nNumber of words of each length (desc order):");
        try (Stream<String> lines = Files.lines(dictionary)) {
            Map<Integer, Long> map = lines.filter(s -> s.length() > 20)
                    .collect(Collectors.groupingBy(
                            String::length, Collectors.counting()));
            map.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                    .forEach(e -> System.out.printf("Length %d: %2d words%n",
                            e.getKey(), e.getValue()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
