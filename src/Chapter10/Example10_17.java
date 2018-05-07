package Chapter10;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class Example10_17 {
    @Test
    public void iterate() throws Exception {
        List<BigDecimal> bigDecimals =
                Stream.iterate(BigDecimal.ZERO, bd -> bd.add(BigDecimal.ONE))
                        .limit(10)
                        .collect(Collectors.toList());
        assertEquals(10, bigDecimals.size());
        bigDecimals = Stream.iterate(BigDecimal.ZERO,
                bd -> bd.longValue() < 10L,
                bd -> bd.add(BigDecimal.ONE))
                .collect(Collectors.toList());
        assertEquals(10, bigDecimals.size());
    }
}
