package Chapter1;

/**
 * Project: ModenJavaRecipes
 * FileName: MyInterface
 * Date: 2017-09-19
 * Time: 오전 10:16
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@FunctionalInterface
public interface MyInterface {
    int myMethod();
    default String sayHello() {
        return "Hello, world!";
    }
    static void myStaticMethod() {
        System.out.println("I'm a static method in an interface.");
    }
}
