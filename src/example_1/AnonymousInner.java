package example_1;

import java.io.File;
import java.util.Arrays;

/**
 * Project: ModenJavaRecipes
 * FileName: AnonymousInner
 * Date: 2017-09-14
 * Time: 오후 3:51
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class AnonymousInner {
    public static void main(String[] args) {
        File directory = new File("./src/example_1");
        String[] names = directory.list((dir, name) -> name.endsWith(".java"));
        System.out.println(Arrays.asList(names));
    }
}
