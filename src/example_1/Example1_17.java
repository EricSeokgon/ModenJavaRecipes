package example_1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example1_17
 * Date: 2017-09-18
 * Time: 오전 10:53
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example1_17 {
    public static void main(String[] args) {
        Person before = new Person("하데스");

        List<Person> people = Stream.of(before)
                .collect(Collectors.toList());
        Person after = people.get(0);

        before.setName("뽀로로");

    }
}
