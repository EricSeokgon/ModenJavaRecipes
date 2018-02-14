package Chapter6;

import java.util.Optional;

/**
 * Project: ModenJavaRecipes
 * FileName: Example6_12
 * Date: 2018-02-14
 * Time: 오전 10:04
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Department {
    private Manager boss;
    public Optional<Manager> getBoss() {
        return Optional.ofNullable(boss);
    }
    public void setBoss(Manager boss) {
        this.boss = boss;
    }
}