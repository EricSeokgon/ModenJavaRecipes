package Chapter10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class PrivateDemo implements SumNumbers {
}

public class SumNumbersTest {
    private SumNumbers demo = new PrivateDemo();

    @Test
    public void addEvens() throws Exception {
        assertEquals(2 + 4 + 6, demo.addEvens(1, 2, 3, 4, 5, 6));
    }

    @Test
    public void addOdds() throws Exception {
        assertEquals(1 + 3 + 5, demo.addOdds(1, 2, 3, 4, 5, 6));
    }
}
