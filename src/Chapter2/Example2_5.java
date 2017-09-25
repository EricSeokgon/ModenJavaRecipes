package Chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Project: ModenJavaRecipes
 * FileName: Example2_5
 * Date: 2017-09-20
 * Time: 오전 9:37
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example2_5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("하데스", "뽀로로", "에디", "크롱", "패티", "포비", "루피","뽀삐");

        Optional<String> first = names.stream()
                .filter(name -> name.startsWith("이"))
                .findFirst();

        System.out.println(first);
        System.out.println(first.orElse("None"));

        System.out.println(first.orElse(String.format("No result found in %s",
                names.stream().collect(Collectors.joining(", ")))));

        System.out.println(first.orElseGet(()->
        String.format("No result found in %s",
                names.stream().collect(Collectors.joining(", ")))));
    }
}
