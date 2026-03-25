
import java.util.Arrays;
import java.util.List;

public class Reduce8 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(12,45,67,23,89,34,78);
        int max = list.stream().reduce(1,(a,b) ->a>b?a:b);
     int result = list.stream().reduce(1,(a,b) ->a>b && a<max?a:b);      
        System.out.println(result);
    }
}