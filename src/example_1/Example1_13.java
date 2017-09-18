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
        List<String> names = Arrays.asList("하데스", "뽀로로", "옥터넛", "번개맨", "아이쿠");

        List<Person> people = names.stream()
                .map(name -> new Person(name)) //Using a lambda expression to invoke the constructor
                .collect(Collectors.toList());

        List<Person> people1 = names.stream()
                .map(Person::new)  //Using a constructor reference instantiating Person
                .collect(Collectors.toList());
    }
}
