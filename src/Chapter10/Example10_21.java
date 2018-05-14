package Chapter10;

import java.util.ArrayList;
import java.util.List;

public class Example10_21 {
    public class Task {
        private String name;
        private long budget;
        private List<Developer> developers = new ArrayList<>();
        // ... constructors, getters and setters, etc. ...
    }

    public class Developer {
        private String name;
        // ... constructors, getters and setters, etc. ...
    }
}
