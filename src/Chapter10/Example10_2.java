package Chapter10;

import java.util.stream.Stream;

public class Example10_2 {
    public static void main(String[] args) {
        NamesSupplier supplier = new NamesSupplier();

        try (Stream<String> lines = supplier.get()) {
            lines.forEach(line -> System.out.printf("Hello, %s!%n", line));
        }
    }
}
