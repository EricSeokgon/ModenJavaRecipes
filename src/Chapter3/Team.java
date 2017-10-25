package Chapter3;

import java.text.NumberFormat;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_43
 * Date: 2017-10-25
 * Time: 오전 10:06
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Team {
    private static NumberFormat nf = NumberFormat.getCurrencyInstance();

    private int id;
    private String name;
    private double salary;

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
