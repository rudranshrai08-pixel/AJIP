
import java.util.Arrays;
import java.util.List;

public class Reduce10 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5);
     int result = list.stream().reduce(0,(a,b)  ->(a+b)%list.size() == 0 ? a+b : a);      
        System.out.println(result);
    }
}