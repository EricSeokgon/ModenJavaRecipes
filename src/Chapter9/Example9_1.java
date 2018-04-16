package Chapter9;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertFalse;

public class Example9_1 {
    @Test
    public void sequentialStreamOd() throws Exception {
        assertFalse(Stream.of(3, 1, 4, 1, 5, 9).isParallel());
    }

    @Test
    public void sequentailIterateStream() throws Exception {
        assertFalse(Stream.iterate(1, n -> n + 1).isParallel());
    }

    @Test
    public void sequentailGenerateStream() throws Exception {
        assertFalse(Stream.generate(Math::random).isParallel());
    }

    @Test
    public void sequentailCollectionStream() throws Exception {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);
        assertFalse(numbers.stream().isParallel());
    }
}
