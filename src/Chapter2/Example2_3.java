package Chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Project: ModenJavaRecipes
 * FileName: Example2_1
 * Date: 2017-09-20
 * Time: 오전 9:19
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example2_3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
        //Anonymous inner class implementation
        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        strings.forEach(s-> System.out.println(s)); //Expression lambda
        strings.forEach(System.out::println); //Method lambda
    }
}
