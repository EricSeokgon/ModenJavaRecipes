package example_2;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.Stream;

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
        names = Stream.of("Hades", "Pororo", "Crong", "Edi", "lupy")
                .sorted()
                .toArray(String[]::new);
    }

    @Test
    public void getnamesOfLength3() throws Exception {
        assertEquals("Crong, Hades", demo1.getNameOfLength(5, names));
    }

}