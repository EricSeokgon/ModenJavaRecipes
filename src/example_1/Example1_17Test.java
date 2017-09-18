package example_1;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Project: ModenJavaRecipes
 * FileName: Example1_17Test
 * Date: 2017-09-18
 * Time: 오전 10:58
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
class Example1_17Test {
    @Test
    void SameObjectTest() {
        Person before = new Person("하데스");

        List<Person> people = Stream.of(before)
                .collect(Collectors.toList());
        Person after = people.get(0);
        assertTrue(before == after);
        before.setName("뽀로로");
        assertEquals("뽀로로", after.getName());
    }

}