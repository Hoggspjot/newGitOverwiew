package september.day160925;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 5);
        map.put("orange", 8);

        map.computeIfPresent("banana", (key, value) -> value - 2);
        map.computeIfAbsent("grape", k -> 7);
        map.merge("apple", 5, Integer::sum);
        map.merge("orange", 3, (oldVal, newVal) -> oldVal * newVal);

        System.out.println(map);

    }
}
