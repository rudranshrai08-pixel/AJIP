import java.util.Arrays;
import java.util.List;
public class Filter3 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Java", "Python", "C++", "React", "Node.js", "Next.js", "C#");
        List<String> filteredData = data.stream().filter((s) -> s.length() > 4).toList();
        System.out.println(filteredData);
    }
}