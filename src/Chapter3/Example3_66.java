package Chapter3;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_66
 * Date: 2017-11-02
 * Time: 오전 9:10
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_66 {
    public int multByTwo(int n) {
        System.out.printf("Inside multByTwo with arg %d%n");
        return n * 2;
    }

    public boolean divByThree(int n) {
        System.out.print("Inside divByThree with arg %d%n");
        return n % 3 == 0;
    }

    OptionalInt firstEvenDoubleDivBy3 = IntStream.range(100, 200)
            .map(this::multByTwo)
            .filter(this::divByThree)
            .findFirst();
}
