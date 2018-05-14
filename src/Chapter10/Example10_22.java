package Chapter10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Example10_22 {
    public static void main(String[] args) {
        Example10_21.Developer venkat = new Example10_21.Developer("Venkat");
        Example10_21.Developer daniel = new Example10_21.Developer("Daniel");
        Example10_21.Developer brian = new Example10_21.Developer("Brian");
        Example10_21.Developer matt = new Example10_21.Developer("Matt");
        Example10_21.Developer nate = new Example10_21.Developer("Nate");
        Example10_21.Developer craig = new Example10_21.Developer("Craig");
        Example10_21.Developer ken = new Example10_21.Developer("Ken");
        Example10_21.Task java = new Example10_21.Task("Java stuff", 100);
        Example10_21.Task altJvm = new Example10_21.Task("Groovy/Kotlin/Scala/Clojure", 50);
        Example10_21.Task javaScript = new Example10_21.Task("JavaScript (sorry)", 100);
        Example10_21.Task spring = new Example10_21.Task("Spring", 50);
        Example10_21.Task jpa = new Example10_21.Task("JPA/Hibernate", 20);
        java.addDevelopers(venkat, venkat, daniel);
        javaScript.addDevelopers(venkat, venkat, nate);
        spring.addDevelopers(venkat, craig, matt);
        altJvm.addDevelopers(venkat, daniel, ken);
        List<Example10_21.Task> tasks = Arrays.asList(java, altJvm, javaScript, spring, jpa);
        Map<Long, List<Example10_21.Task>> taskMap = tasks.stream()
                .collect(groupingBy(Example10_21.Task::getBudget));
    }
}
