package Chapter3;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_40
 * Date: 2017-10-25
 * Time: 오전 9:20
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_42 {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats = DoubleStream.generate(Math::random)
                .limit(1_000_000)
                .summaryStatistics();

        System.out.println(stats);

        System.out.println("count : " + stats.getCount());
        System.out.println("min : " + stats.getMin());
        System.out.println("max : " + stats.getMax());
        System.out.println("sum  : " + stats.getSum());
        System.out.println("ave : " + stats.getAverage());
    }
}
