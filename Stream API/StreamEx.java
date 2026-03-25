import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx {

    public static void main(String[] args) {
        // List data = Arrays.asList(23, 45, 12, 56, 78,90);
        // List data = List.of(23, 45, 12, 56, 78,90);
        List<Integer> data = Arrays.asList(10, 60, 12, 56, 78,90,25,65,87);
        ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(73);
        // list.addAll(Arrays.asList(34, 56, 78));
        list.addAll(data);
        System.out.println(list);
        List<Integer> g50=list.stream().filter((n)-> n>50).toList();
        list.stream().filter((n)-> n>=50 && n<=70).forEach((value)->System.out.println(value+" "));
       System.out.println();
         System.out.println(g50);
        
    // Stream<Integer> listStream = data.stream();
    // list.stream().filter(n->n>50).forEach(System.out::println);
    }
}