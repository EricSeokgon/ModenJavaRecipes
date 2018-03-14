package Chapter7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example7_8
 * Date: 2018-03-14
 * Time: 오전 9:06
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example7_8 {
    public static void main(String[] args) {
        try(
                Stream<Path> paths =
                        Files.find(Paths.get("C:\\Users\\user\\IdeaProjects\\ModenJavaRecipes\\src"), Integer.MAX_VALUE,
                                (path, attributes) ->
                                        !attributes.isDirectory() && path.toString().contains("Chapter7")))

        {
            paths.forEach(System.out::println);
        } catch(
                IOException e)

        {
            e.printStackTrace();
        }
    }
}
