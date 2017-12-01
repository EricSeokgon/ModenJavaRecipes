package Chapter4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_26
 * Date: 2017-12-01
 * Time: 오전 10:18
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_26 {
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


        Optional<Employee> optionalEmp = employees.stream()
                .max(Comparator.comparingInt(Employee::getSalary));

        System.out.println("Emp with max salary: " +
                optionalEmp.orElse(defaultEmployee));
    }
}
