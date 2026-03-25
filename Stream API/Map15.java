import java.util.*;
public class Map15 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(number);
        System.out.println(list);

        List<Boolean> evenBool = list.stream().map(num ->num%2==0).toList();

        System.out.println(evenBool);

    
    }
}