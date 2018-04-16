package Chapter9;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Example9_2 {
    @Test
    public void paralleStreamMethodCollection() throws Exception {
        List<Integer> number = Arrays.asList(3, 1, 4, 1, 5, 9);
        assertTrue(number.parallelStream().isParallel());
    }
}
