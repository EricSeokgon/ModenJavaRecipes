package Chapter6;

/**
 * Project: ModenJavaRecipes
 * FileName: Exmaple6_18
 * Date: 2018-02-26
 * Time: 오전 9:09
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Exmaple6_18 {
    public static void main(String[] args) {
        Company co = new Company();
        System.out.println(
                co.getDepartment()
                        .flatMap(Department::getBoss)
                        .map(Manager::getName));
    }
}
