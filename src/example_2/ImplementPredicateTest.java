package example_2;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.Stream;

import static example_2.ImplementPredicate.LENGTH_FIVE;
import static example_2.ImplementPredicate.STARTS_WITH_S;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Project: ModenJavaRecipes
 * FileName: ImplementPredicateTest
 * Date: 2017-09-20
 * Time: 오후 5:30
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ImplementPredicateTest {
    private ImplementPredicate demo = new ImplementPredicate();
    private Example2_7 demo1 = new Example2_7();
    private Example2_8 demo2 = new Example2_8();
    private String[] names;

    @Before
    public void setUp() {
        names = Stream.of("Alpha", "Delta", "Hotel", "Bravo", "Kilo",
                "Echo", "Charlie", "Lima", "Mike")
                .sorted()
                .toArray(String[]::new);
    }

    @Test
    public void getnamesOfLength5() throws Exception {
        assertEquals("Inara, Jayne, River, Simon", demo1.getNameOfLength(5, names));
    }

    @Test
    public void getNamesStartingWithS() throws Exception {
        assertEquals("Shepherd Book, Simon", demo2.getNamesStartingWith("S", names));
    }

    @Test
    public void getNamesSatisfyingCondition() throws Exception {
        assertEquals("Inara, Jayne, River, Simon",
                demo.getNamesSatisfyingCondition(s -> s.length() == 5, names));
        assertEquals("Shepherd Book, Simon",
                demo.getNamesSatisfyingCondition(s -> s.startsWith("S"),
                        names));
        assertEquals("Inara, Jayne, River, Simon",
                demo.getNamesSatisfyingCondition(LENGTH_FIVE, names));
        assertEquals("Shepherd Book, Simon",
                demo.getNamesSatisfyingCondition(STARTS_WITH_S, names));
    }
    @Test
    public void composedPredicate() throws Exception {
        assertEquals("Simon",
                demo.getNamesSatisfyingCondition(
                        LENGTH_FIVE.and(STARTS_WITH_S), names));
        assertEquals("Inara, Jayne, River, Shepherd Book, Simon",
                demo.getNamesSatisfyingCondition(
                        LENGTH_FIVE.or(STARTS_WITH_S), names));
        assertEquals("Kaylee, Mal, Shepherd Book, Wash, Zoë",
                demo.getNamesSatisfyingCondition(LENGTH_FIVE.negate(), names));
    }
}