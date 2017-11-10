package Chapter4;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_9
 * Date: 2017-11-10
 * Time: 오후 1:19
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_9 {
    Set<String> villains =
            Stream.of("Casanova Frankenstein", "The Disco Boys",
                    "The Not-So-Goodie Mob", "The Suits", "The Suzies",
                    "The Furriers", "The Furriers")
                    .collect(Collectors.toSet());
}
