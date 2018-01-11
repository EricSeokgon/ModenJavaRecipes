package Chapter5;

/**
 * Project: ModenJavaRecipes
 * FileName: CompanyEmployee
 * Date: 2018-01-11
 * Time: 오후 1:20
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CompanyEmployee implements Company, Employee {
    @Override
    public String getFirst() {
        return null;
    }

    @Override
    public String getLast() {
        return null;
    }

    @Override
    public void convertCaffeineToCodeForMoney() {

    }

    @Override
    public String getName() {
        return String.format("%s working for %s",
                Employee.super.getName(), Company.super.getName());
    }

}