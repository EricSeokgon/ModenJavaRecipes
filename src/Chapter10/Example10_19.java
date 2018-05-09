package Chapter10;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example10_19 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> nums = random.ints(50, 0, 100)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .takeWhile(n -> n > 90)
                .collect(Collectors.toList());
    }
}
