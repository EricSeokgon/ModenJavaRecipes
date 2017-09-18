package example_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example1_13
 * Date: 2017-09-18
 * Time: 오전 10:38
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example1_13 {
    public static void main(String[] args) {
        List<String> names = people.stream()
                .map(person -> person.getName())
                .collect(Collectors.toList());

        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
    }
}
