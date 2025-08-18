import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        for (Integer i : list) {
            System.out.println(i);
        }

    }
}
