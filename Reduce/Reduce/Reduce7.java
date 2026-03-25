
import java.util.Arrays;
import java.util.List;

public class Reduce7 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,34,34,45,67);
     int result = list.stream().reduce(1,(a,b) ->b>a?a:b);      
        System.out.println(result);
    }
}