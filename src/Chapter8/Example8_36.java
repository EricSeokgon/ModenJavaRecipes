package Chapter8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;

import static Chapter8.Example8_35.getRegionNamesForOffset;

public class Example8_36 {
    public static List<String> getRegionNamesForZoneId(ZoneId zoneId) {
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zdt = now.atZone(zoneId);
        ZoneOffset offset = zdt.getOffset();
        return getRegionNamesForOffset(offset);
    }
}
