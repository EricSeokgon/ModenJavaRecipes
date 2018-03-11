package Chapter7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example7_6
 * Date: 2018-03-12
 * Time: 오전 8:41
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example7_6 {
    public static void main(String[] args) {
        try (Stream<Path> list = Files.list(Paths.get("C:\\Users\\user\\IdeaProjects\\ModenJavaRecipes\\src\\Chapter7"))) {
            list.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
