import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//
//        System.out.println(list);
//
//        List<Integer> list2 = list.stream()
//                .map(element -> element.length())
//                .collect(Collectors.toList());
//        System.out.println(list2);
//
//        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        array = Arrays.stream(array)
//                .map(operand -> {
//                    if (operand % 3 == 0) {
//                        operand = operand / 3;
//                    }
//                    return operand;
//                }).toArray();
//
//        System.out.println(Arrays.toString(array));

        Set<String> set = new HashSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("ok");
        set.add("poka");
        System.out.println(set);

        Set<Integer> set2 = set.stream()
                .map(e -> e.length())
                .collect(Collectors.toSet());

        System.out.println(set2);

        List<Integer> list1 = set.stream()
                .map(e -> e.length()).collect(Collectors.toList());
        System.out.println(list1);
    }
}
