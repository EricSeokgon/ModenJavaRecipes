package example_1;

import java.io.File;

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
        String[] names = directory.list((File dir, String name) -> name.endsWith(".java"));

    }
}
