import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class Map2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(numbers);
        System.out.println(list);
        List<Integer> squares=list.stream().map((number)-> number*number).toList();
        System.out.println(squares);
    }
}