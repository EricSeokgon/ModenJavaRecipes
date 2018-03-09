package Chapter7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example7_5
 * Date: 2018-03-09
 * Time: 오후 1:05
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example7_5 {
    public static void main(String[] args) {
        try (Stream<String> lines =
                     new BufferedReader(
                             new FileReader("C:\\Users\\user\\IdeaProjects\\ModenJavaRecipes\\src\\Chapter7\\Example7_5.java")).lines()) {
            // ... same as previous example ...
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
