package Chapter10;

import java.util.Optional;

public class Example10_28 {
    private NamesSupplier map;

    public Optional<Object> findById(int id) {
        return Optional.ofNullable(map.get(id));
    }
}
