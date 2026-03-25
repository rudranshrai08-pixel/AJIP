
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Reduce11 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(12,45,67,23,89,34,78);
        int max = list.stream().reduce(1,(a,b) ->a>b?a:b);
     int result = list.stream().reduce(1,(a,b) ->a>b && a<max?a:b);   
     int n=5;
     int fact = IntStream.rangeClosed(1,n).reduce(1,(a,b) ->a*b);   
        System.out.println(fact);
    }
}