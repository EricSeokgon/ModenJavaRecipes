package Chapter8;

import org.junit.Test;

import java.time.ZoneId;
import java.util.List;

import static Chapter8.Example8_38.getRegionNamesForOffset;
import static org.junit.Assert.assertTrue;

public class Example8_39 {
    private static final Example8_36 RegionIdsByOffset = null;

    @Test
    public void getRegionNamesForGMT() throws Exception {
        List<String> names = getRegionNamesForOffset(0, 0);
        assertTrue(names.contains("GMT"));
        assertTrue(names.contains("Etc/GMT"));
        assertTrue(names.contains("Etc/UTC"));
        assertTrue(names.contains("UTC"));
        assertTrue(names.contains("Etc/Zulu"));
    }

    @Test
    public void getRegionNamesForNepal() throws Exception {
        List<String> names = getRegionNamesForOffset(5, 45);
        assertTrue(names.contains("Asia/Kathmandu"));
        assertTrue(names.contains("Asia/Katmandu"));
    }

    @Test
    public void getRegionNamesForChicago() throws Exception {
        ZoneId chicago = ZoneId.of("America/Chicago");
        List<String> names = RegionIdsByOffset.getRegionNamesForZoneId(chicago);
        assertTrue(names.contains("America/Chicago"));
        assertTrue(names.contains("US/Central"));
        assertTrue(names.contains("Canada/Central"));
        assertTrue(names.contains("Etc/GMT+5") || names.contains("Etc/GMT+6"));
    }
}
