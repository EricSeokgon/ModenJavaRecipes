package Chapter6;

/**
 * Project: ModenJavaRecipes
 * FileName: Example6_17
 * Date: 2018-02-23
 * Time: 오후 1:01
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example6_17 {
    public static void main(String[] args) {
        Company co = new Company();
        Department d = new Department();
        co.setDepartment(d);
        System.out.println("Company Dept: " + co.getDepartment());
        System.out.println("Company Dept Manager: " + co.getDepartment()
                .map(Department::getBoss));
    }
}
