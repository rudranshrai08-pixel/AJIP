import java.util.*;

class EmployeeDTO {
    int id;
    String name;

    public EmployeeDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}






public class Map16 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4);

       
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1,"Ankit","CSE"));
        list.add(new Employee(2,"Rahul","MCA"));
        System.out.println(list);
        List<EmployeeDTO> empName = list.stream().map(emp -> new EmployeeDTO(emp.id, emp.name)).toList();
        System.out.println(empName);
    }
}