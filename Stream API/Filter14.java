import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Filter14 {
    public static void main(String[] args) {
        List<String>data = Arrays.asList("Python","Go", "Java","Rubby");
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(data);
        List<String> listA= list.stream().filter((s)-> s.contains("o")).toList();
        System.out.println(listA);
    }
}