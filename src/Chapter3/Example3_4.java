package Chapter3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_4
 * Date: 2017-09-25
 * Time: 오후 1:11
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_4 {
    public static void main(String[] args) {
        List<BigDecimal> nums = Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE))
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(nums);

        Stream.iterate(LocalDate.now(), Id -> Id.plusDays(1L))
                .limit(10)
                .forEach(System.out::println);
    }
}
