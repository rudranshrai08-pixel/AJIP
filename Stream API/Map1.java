import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sachin", "rahul", "amit");
      ArrayList<String> list = new ArrayList<String>();
      list.addAll(names);
        System.out.println(list);
        List<String> captalize=list.stream().map((name)-> name.toUpperCase()).toList();
        System.out.println(captalize);
    }
}