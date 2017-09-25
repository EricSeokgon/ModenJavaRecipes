package Chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example2_13
 * Date: 2017-09-21
 * Time: 오전 10:20
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example2_13 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(("Alpha"), "Delta", "Hotel", "Bravo", "Kilo",
                "Echo", "Charlie", "Lima", "Mike");
        //Anonymous inner class
        List<Integer> nameLengths = names.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return s.length();
                    }
                })
                .collect(Collectors.toList());

        //Lambda expression
        List<Integer> nameLengths1 = names.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        //mehtod reference
        List<Integer> nameLengths2 = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.printf("nameLengths = %s%n", nameLengths);
        System.out.printf("nameLengths1 = %s%n", nameLengths1);
        System.out.printf("nameLengths2 = %s%n", nameLengths2);
    }
}
