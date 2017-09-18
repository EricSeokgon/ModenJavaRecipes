package example_1;

/**
 * Project: ModenJavaRecipes
 * FileName: Person
 * Date: 2017-09-18
 * Time: 오전 10:39
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(Person p) {
        this.name = p.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
