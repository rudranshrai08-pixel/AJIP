
import java.util.Arrays;
import java.util.List;

public class ReduceEx {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,34,34,45,67);
     int result = list.stream().reduce(1,(a, b) -> a * b);       //Accumulated result is stored in a and b is the current element of the stream
        System.out.println(result);
    }
}