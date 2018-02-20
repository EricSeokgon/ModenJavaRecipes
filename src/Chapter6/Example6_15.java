package Chapter6;

/**
 * Project: ModenJavaRecipes
 * FileName: Example6_15
 * Date: 2018-02-21
 * Time: 오전 8:30
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example6_15 {
    public static void main(String[] args) {
        Manager mrSlate = new Manager("Mr. Slate");
        Department d = new Department();
        d.setBoss(mrSlate);
        Department d1 = new Department();
        System.out.println("Boss: " + d1.getBoss());
        System.out.println("Boss: " + d.getBoss());
        System.out.println("Name: " +
                d.getBoss().orElse(new Manager("Unknown")).getName());
        System.out.println("Name: " +
                d1.getBoss().orElse(new Manager("Unknown")).getName());
        System.out.println("Name: " + d.getBoss().map(Manager::getName));
        System.out.println("Name: " + d1.getBoss().map(Manager::getName));
    }
}
