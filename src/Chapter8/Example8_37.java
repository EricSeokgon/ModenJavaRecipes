package Chapter8;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import static Chapter8.Example8_36.getRegionNamesForZoneId;
import static org.junit.Assert.assertTrue;

public class Example8_37 {
    @Test
    public void getRegionNamesForSystemDefault() throws Exception {
        ZonedDateTime now = ZonedDateTime.now();
        ZoneId zoneId = now.getZone();
        List<String> names = getRegionNamesForZoneId(zoneId);
        assertTrue(names.contains(zoneId.getId()));
    }
}
