package Chapter8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import java.util.stream.Collectors;

public class Example8_35 {
    public static List<String> getRegionNamesForOffset(ZoneOffset offset) {
        LocalDateTime now = LocalDateTime.now();
        return ZoneId.getAvailableZoneIds().stream()
                .map(ZoneId::of)
                .filter(ZoneId -> now.atZone(ZoneId).getOffset().equals(offset))
                .map(ZoneId::toString)
                .sorted()
                .collect(Collectors.toList());
    }
}
