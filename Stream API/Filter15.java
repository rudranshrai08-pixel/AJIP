import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter15 {
    public static void main(String[] args ) {
        List<Integer> data = Arrays.asList(10,15,20,25,30,11,17,16);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(data);
        List<Integer> listA=list.stream().filter((n)-> n%2==0).filter(number->number>15).toList();
        System.out.println(listA);
    }
}