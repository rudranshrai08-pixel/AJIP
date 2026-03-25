import java.util.Arrays;
import java.util.List;
public class Filter4 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Java", "Null", "Null", "React", "Node.js", "Next.js", "Null");
        List<String> filteredData = data.stream().filter((s) -> s != null && !s.equals("Null")).toList();
        
        System.out.println(filteredData);
    }
}