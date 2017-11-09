package Chapter4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_8
 * Date: 2017-11-09
 * Time: 오전 10:05
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_8 {
    List<String> superHeroes = Stream.of("Mr. Furious", "The Blue Raja", "The Shoveler", "The Bowler",
            "Invisible boy", "The Spleen", "The Sphinx")
            .collect(Collectors.toList());
}
