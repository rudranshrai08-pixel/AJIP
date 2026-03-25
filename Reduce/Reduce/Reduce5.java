
import java.util.Arrays;
import java.util.List;

public class Reduce5 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,112,3,34,34,45,67);
     int result = list.stream().reduce(0,(a,b)  ->b%2==0 ? a+b : a);      
        System.out.println(result);
    }
}