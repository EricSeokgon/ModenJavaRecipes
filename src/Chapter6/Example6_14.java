package Chapter6;

/**
 * Project: ModenJavaRecipes
 * FileName: Example6_14
 * Date: 2018-02-20
 * Time: 오전 9:04
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example6_14 {
    public static void main(String[] args) {
        Manager mrSlate = new Manager("Mr. Slate");
        Department d = new Department();
        d.setBoss(mrSlate);
        System.out.println("Boss: " + d.getBoss());
        Department d1 = new Department();
        System.out.println("Boss: " + d1.getBoss());
    }
}
