package Chapter2;

import java.util.function.DoubleSupplier;
import java.util.logging.Logger;

/**
 * Project: ModenJavaRecipes
 * FileName: Example2_4
 * Date: 2017-09-20
 * Time: 오전 9:27
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example2_4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("...");

        DoubleSupplier randomSupplier = new DoubleSupplier() {
            @Override
            public double getAsDouble() {
                return Math.random();
            }
        };

        //randomSupplier = () -> Math.random();
        //randomSupplier = Math::random;

        logger.info(String.valueOf(randomSupplier));
    }
}
