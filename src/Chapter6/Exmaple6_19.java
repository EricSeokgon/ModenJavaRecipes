package Chapter6;

import java.util.Optional;

/**
 * Project: ModenJavaRecipes
 * FileName: Exmaple6_29
 * Date: 2018-02-27
 * Time: 오전 9:00
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Exmaple6_19 {
    public static void main(String[] args) {
        Company co = new Company();
        Optional<Company> company = Optional.of(co);
        System.out.println(
                company
                        .flatMap(Company::getDepartment)
                        .flatMap(Department::getBoss)
                        .map(Manager::getName)
        );
    }
}
