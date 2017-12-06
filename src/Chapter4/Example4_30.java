package Chapter4;

import java.util.*;

/**
 * Project: ModenJavaRecipes
 * FileName: Example4_30
 * Date: 2017-12-06
 * Time: 오전 9:09
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example4_30 {
    static <T> List<T> unmodifiableList(List<? extends T> list){
        return null;
    }
    static <T> Set<T> unmodifiableSet(Set<? extends T> s){
        return null;
    }
    static <K,V> Map<K,V> unmodifiableMap(Map<? extends K,? extends V> m){
        return null;
    }

    @SafeVarargs
    public final <T> List<T> createImmutableListJava7(T... elements) {
        return Collections.unmodifiableList(Arrays.asList(elements));
    }
    @SafeVarargs
    public final <T> Set<T> createImmutableSetJava7(T... elements) {
        return Collections.unmodifiableSet(new HashSet<>(Arrays.asList(elements)));
    }
}
