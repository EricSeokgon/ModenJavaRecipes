package Chapter4;

import java.util.Arrays;
import java.util.List;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_24
 * Date: 2017-11-29
 * Time: 오전 9:08
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_24 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Cersei", 250_000, "Lannister"),
                new Employee("Jamie", 150_000, "Lannister"),
                new Employee("Tyrion", 1_000, "Lannister"),
                new Employee("Tywin", 1_000_000, "Lannister"),
                new Employee("Jon Snow", 75_000, "Stark"),
                new Employee("Robb", 120_000, "Stark"),
                new Employee("Eddard", 125_000, "Stark"),
                new Employee("Sansa", 0, "Stark"),
                new Employee("Arya", 1_000, "Stark"));
        Employee defaultEmployee =
                new Employee("A man (or woman) has no name", 0, "Black and White");
    }
}
