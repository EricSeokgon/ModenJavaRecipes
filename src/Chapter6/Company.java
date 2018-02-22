package Chapter6;

import java.util.Optional;

/**
 * Project: ModenJavaRecipes
 * FileName: Company
 * Date: 2018-02-22
 * Time: 오전 9:08
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Company {
    private Department department;
    public Optional<Department> getDepartment() {
        return Optional.ofNullable(department);
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
}
