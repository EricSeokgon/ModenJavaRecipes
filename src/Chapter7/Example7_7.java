package Chapter7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example7_7
 * Date: 2018-03-13
 * Time: 오전 9:06
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example7_7 {
    public static void main(String[] args) {
        try (Stream<Path> paths = Files.walk(Paths.get("C:\\Users\\user\\IdeaProjects\\ModenJavaRecipes"))) {
            paths.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
