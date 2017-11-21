package Chapter4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_16
 * Date: 2017-11-21
 * Time: 오전 9:14
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_18 {
    private static Path dictionary;

    public static void main(String[] args) {
        System.out.println("\nNumber of words of each length:");        
        try (Stream<String> lines = Files.lines(dictionary)) {
            lines.filter(s -> s.length() > 20)
                    .collect(Collectors.groupingBy(
                            String::length, Collectors.counting()))
                    .forEach((len, num) -> System.out.printf("%d: %d%n", len, num));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
