package Chapter9;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GamePageLinksSupplier implements Supplier<List<String>> {
    private static final String BASE =
            "http://gd2.mlb.com/components/game/mlb/";
    private LocalDate startDate;
    private int days;

    public GamePageLinksSupplier(LocalDate startDate, int days) {
        this.startDate = startDate;
        this.days = days;
    }

    public List<String> getGamePageLinks(LocalDate localDate) {

        return null;
    }

    @Override
    public List<String> get() {
        return Stream.iterate(startDate, d -> d.plusDays(1))
                .limit(days)
                .map(this::getGamePageLinks)
                .flatMap(list -> list.isEmpty() ? Stream.empty() : list.stream())
                .collect(Collectors.toList());
    }
}