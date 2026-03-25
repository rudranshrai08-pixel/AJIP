import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class MapEx {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(10,45,35,75,80,91,67,76);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(marks);
        System.out.println(list);
        List<Integer> grace5=list.stream().filter((mark)-> mark<40).map((mark)-> mark+5).toList();
        System.out.println(grace5);
    }
}