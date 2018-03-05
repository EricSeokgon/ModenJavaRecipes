package Chapter7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example7_1
 * Date: 2018-03-05
 * Time: 오전 9:36
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example7_1 {
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Paths.get("/usr/share/dict/web2")) {
            lines.filter(s -> s.length() > 20)
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .limit(10)
                    .forEach(w -> System.out.printf("%s (%d)%n", w, w.length()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
