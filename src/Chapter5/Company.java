package Chapter5;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_13
 * Date: 2018-01-10
 * Time: 오전 8:37
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface Company {
    default String getName() {
        return "Initech";
    }
// other methods
}
