import java.util.*;

class Employee  {
    double age;
    double salary;
    String name;

    public double getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Employee(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public static final Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o2.getSalary() - o1.getSalary());
        }


    };

    public String toString()
    {
        return "Employee { Age = "+age+"\n Salary = "+salary +"\n Name = "+name+ " }\n\n ";
    }


}
public class Exercise4 {
    public static void main(String[] args) {
        Employee[] obj = new Employee[5];
        obj[0] = new Employee(25,50000,"Ram");
        obj[1] = new Employee(25,60000,"Shyam");
        obj[2] = new Employee(24,55000,"Geeta");
        obj[3] = new Employee(27,50000,"Rahul");
        obj[4] = new Employee(26,70000,"Kishan");

        List <Employee> list = new ArrayList<Employee>();
        list.add(obj[0]);
        list.add(obj[1]);
        list.add(obj[2]);
        list.add(obj[3]);
        list.add(obj[4]);
        System.out.println("Employees Before Sorting: "+list);
        Collections.sort(list,Employee.SalaryComparator);
        System.out.println("After Sorting: "+list);
    }

}
