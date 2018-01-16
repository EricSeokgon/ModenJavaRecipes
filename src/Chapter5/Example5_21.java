package Chapter5;

import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 * Project: ModenJavaRecipes
 * FileName: Example5_21
 * Date: 2018-01-17
 * Time: 오전 8:46
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example5_21 {
    public void info(Supplier<String> msgSupplier) {
        log(Level.INFO, msgSupplier);
    }

    public void log(Level level, Supplier<String> msgSupplier) {
        if (!isLoggable(level)) {
            return;
        }
        LogRecord lr = new LogRecord(level, msgSupplier.get());
        doLog(lr);
    }

    private boolean isLoggable(Level level) {
        return true;
    }

    private void doLog(LogRecord lr) {
    }
}
