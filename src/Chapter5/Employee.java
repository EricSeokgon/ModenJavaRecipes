package Chapter5;

/**
 * Project: ModenJavaRecipes
 * FileName: Employee
 * Date: 2018-01-10
 * Time: 오전 8:38
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
