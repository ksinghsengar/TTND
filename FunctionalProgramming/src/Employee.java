import java.io.*;
class Employee implements Serializable{
    String name;
    int age;
    int salary;

    Employee(){

    }
    Employee(String name,int age,int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int getSalary() {
        return salary;
    }

    protected void setSalary(int salary) {
        this.salary = salary;
    }
}