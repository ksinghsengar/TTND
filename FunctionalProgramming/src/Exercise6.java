
public class Exercise6 {
    public static void main(String[] args) {
        Employee []obj = new Employee[5];
        obj[0]  = new Employee("Ram", 25,50000);
        obj[1] = new Employee("Shyam", 27,55000);
        obj[2] = new Employee("Karan",23,45000);
        obj[3] = new Employee("Nishant",25,57000);
        obj[4] = new Employee("Naman", 22,40000);

        for (Employee e: obj) {
            if(e.name.toLowerCase().charAt(0) == 'n' &&  e.age > 24){
                System.out.println("Employee Name: "+e.name+"\n"+"Age: "+e.age+"\n"+"Salary: "+e.salary+"\n");
            }

        }


    }
}
