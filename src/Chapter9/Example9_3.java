package Chapter9;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;

public class Example9_3 {
    @Test
    public void paralleMethodOnStream() throws Exception {
        assertTrue(Stream.of(3, 1, 4, 1, 5, 9).parallel().isParallel());
    }
}
