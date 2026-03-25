import java.util.*;

class Employee {
    int id;
    String name;
    String dept;

    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
public class Map7 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ankit", "Rahul");

        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1,"Ankit","CSE"));
        list.add(new Employee(2,"Rahul","MCA"));
        System.out.println(list);

        List<String> empName = list.stream().map(emp ->emp.name).toList();

        System.out.println(empName);
    }
}