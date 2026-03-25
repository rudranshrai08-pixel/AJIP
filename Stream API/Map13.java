import java.util.*;
public class Map13  {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Python", "JavaScript");

        ArrayList<String> list = new ArrayList<String>();
        list.addAll(names);
        System.out.println(list);

        List<Integer> hashlist = list.stream().map(lang ->lang.hashCode()).toList();

        System.out.println(hashlist);

    
    }
}