package Chapter4;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_10
 * Date: 2017-11-14
 * Time: 오전 9:04
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_10 {
    public static void main(String[] args) {
        List<String> actors =
                Stream.of("Hank Azaria", "Janeane Garofalo", "William H. Macy",
                        "Paul Reubens", "Ben Stiller", "Kel Mitchell", "Wes Studi")
                        .collect(Collectors.toCollection(LinkedList::new));

    }
}
