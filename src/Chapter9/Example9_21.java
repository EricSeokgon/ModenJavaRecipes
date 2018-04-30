package Chapter9;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class Example9_21 {
    private Example9_20 demo;

    @Test(expected = ExecutionException.class)
    public void testException() throws Exception {
        demo.getProduct(666).get();
    }

    @Test
    public void testExceptionWithCause() throws Exception {
        try {
            demo.getProduct(666).get();
            fail("Houston, we have a problem...");
        } catch (ExecutionException e) {
            assertEquals(ExecutionException.class, e.getClass());
            assertEquals(RuntimeException.class, e.getCause().getClass());

        }
    }
}
