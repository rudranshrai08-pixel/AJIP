import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Map3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java","Python","C++");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(names);
        System.out.println(list);
         List<String> extracStrings=list.stream().map((name)-> String.valueOf(name.charAt(1))).toList();
         System.out.println(extracStrings);

    }
}