package Chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_6
 * Date: 2017-12-22
 * Time: 오후 1:07
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_6 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3, 1, 4, 1, 5, 9);
        AtomicInteger total = new AtomicInteger();
        for (int n : nums) {
            total.addAndGet(n);
        }
        total.set(0);
        nums.forEach(n -> total.addAndGet(n));

        total.set(nums.stream()
                .mapToInt(Integer::valueOf)
                .sum());
        System.out.println(total);
    }
}
