package Chapter4;

import java.util.Arrays;
import java.util.List;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_14
 * Date: 2017-11-17
 * Time: 오전 11:34
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_14 {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book(1, "Modern Java Recipes", 49.99),
                new Book(2, "Java 8 in Action", 49.99),
                new Book(3, "Java SE8 for the Really Impatient", 39.99),
                new Book(4, "Functional Programming in Java", 27.64),
                new Book(5, "Making Java Groovy", 45.99),
                new Book(6, "Gradle Recipes for Android", 23.76)
        );
    }
}
