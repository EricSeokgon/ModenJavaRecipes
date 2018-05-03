package Chapter10;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class Example10_16 {
    @Test
    public void ofNullable() throws Exception {
        Stream<String> stream = Stream.ofNullable("abc");
        assertEquals(1, stream.count());
        stream = Stream.ofNullable(null);
        assertEquals(0, stream.count());
    }
}
