package Chapter4;

import java.util.stream.Stream;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_11
 * Date: 2017-11-15
 * Time: 오전 9:12
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_11 {
    public static void main(String[] args) {
        String[] wannabes =
                Stream.of("The Waffler", "Reverse Psychologist", "PMS Avenger")
                        .toArray(String[]::new);
    }
}
