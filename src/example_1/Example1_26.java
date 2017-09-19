package example_1;

/**
 * Project: ModenJavaRecipes
 * FileName: Example1_26
 * Date: 2017-09-19
 * Time: 오전 11:32
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface Employee {
    String getFirst();

    String getLast();

    void convertCaffeineToCodeForMoney();

    default String getName() {
        return String.format("%s %s", getFirst(), getLast());
    }
}
