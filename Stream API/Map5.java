import java.util.*;

public class Map5 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("A","B","C");

        ArrayList<String> list = new ArrayList<>();
        list.addAll(names);

        System.out.println(list);

        List<String> prefixList = list.stream() .map(name -> "Mr_" + name).toList();

        System.out.println(prefixList);
    }
}