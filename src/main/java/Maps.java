import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 2);
        map.put(2, 3);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
