import java.util.Arrays;
import java.util.List;


public class Filter2 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Amit", "Ravi", "Anil", "Vikas", "Ashok", "Rahul");
        List<String> filteredData = data.stream().filter((s) -> s.startsWith("A")).toList();
        System.out.println(filteredData);
    }
}