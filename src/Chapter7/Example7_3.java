package Chapter7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example7_3
 * Date: 2018-03-07
 * Time: 오전 9:06
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example7_3 {
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Paths.get("C:\\Users\\user\\IdeaProjects\\ModenJavaRecipes\\src\\Chapter7\\Example7_3.java"))) {
            lines.filter(s -> s.length() > 20)
                    .collect(Collectors.groupingBy(String::length, Collectors.counting()))
                    .forEach((len, num) -> System.out.println(len + ": " + num));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
