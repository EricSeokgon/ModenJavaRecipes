package Chapter3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_32Test
 * Date: 2017-10-19
 * Time: 오전 9:49
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
class Example3_32Test {
    @Test
    public void sumDoubleDivisibleBy3() throws Exception {
        Example3_32 demo = new Example3_32();
        assertEquals(1554, demo.sumDoubleDivisibleBy3(100, 120));
    }

}