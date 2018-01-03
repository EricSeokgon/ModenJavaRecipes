package Chapter5;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_8
 * Date: 2018-01-03
 * Time: 오전 9:08
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_8 {
    long fib(long i) {
        if (i == 0) return 0;
        if (i == 1) return 1;
        return fib(i - 1) + fib(i - 2);
    }
}
