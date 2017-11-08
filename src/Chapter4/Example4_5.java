package Chapter4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_5
 * Date: 2017-11-08
 * Time: 오전 10:15
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_5 {
    private List<Golfer> golfers = Arrays.asList(
            new Golfer("Jack", "Nicklaus", 58),
            new Golfer("Tiger", "Woods", 78),
            new Golfer("Tom", "Watson", 78),
            new Golfer("Ty", "Webb", 68),
            new Golfer("Bubba", "Watson", 78)
    );

    public List<Golfer> sortByScoreThenLastThenFirst() {
        return golfers.stream()
                .sorted(Comparator.comparingInt(Golfer::getScore)
                        .thenComparing(Golfer::getLast)
                        .thenComparing(Golfer::getFirst))
                .collect(toList());
    }
}
