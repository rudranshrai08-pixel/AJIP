
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class StreamSort {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(12,45,67,23,89,34,78);
        System.out.println(list);
      List<Integer> sortedList = list.stream().sorted((a,b) -> b-a).toList(); //comparator is a functional interface
         
        System.out.println(sortedList);
    }
}