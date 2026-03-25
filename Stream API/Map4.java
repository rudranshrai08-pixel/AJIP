import java .util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Map4 {
    public static void main(String[] args) {
        List<Integer> names = Arrays.asList(10,20,30,40);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(names);
        System.out.println(list);
            List<String> extracStrings=list.stream().map((num)-> num.toString()).toList();
            System.out.println(extracStrings);
    }
}