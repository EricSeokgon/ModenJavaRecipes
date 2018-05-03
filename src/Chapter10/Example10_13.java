package Chapter10;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Example10_13 {
    @Test
    public void areWeImmutableOrArentWe() throws Exception {
        List<Holder> holders = List.of(new Holder(1), new Holder(2));
        assertEquals(1, holders.get(0).getX());
        holders.get(0).setX(4);
        assertEquals(4, holders.get(0).getX());
    }
}
