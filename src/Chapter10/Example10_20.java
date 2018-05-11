package Chapter10;

public class Example10_20 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> nums = random.ints(50, 0, 100)
                .sorted()
                .dropWhile(n -> n < 90)
                .boxed()
                .collect(Collectors.toList());
    }
}
