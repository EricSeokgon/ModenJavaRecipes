package Chapter8;

import java.time.ZoneOffset;
import java.util.List;

public class Example8_38 {
    public static List<String> getRegionNamesForOffset(int hours, int minutes) {
        ZoneOffset offset = ZoneOffset.ofHoursMinutes(hours, minutes);
        return getRegionNamesForOffset(offset);
    }

    private static List<String> getRegionNamesForOffset(ZoneOffset offset) {
        return null;
    }
}
