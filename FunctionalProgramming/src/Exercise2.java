import java.io.*;
public class Exercise2 {
    public static void main(String[] args){

        Employee e = new Employee();
        e.name = "Ram";
        e.age = 27;
        e.salary = 50000;
        try {

            FileOutputStream fileOutputStream = new FileOutputStream("EmployeeObj.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(e);
            fileOutputStream.close();
            outputStream.close();
            System.out.println("Object is Serialized successfully\n");

        // Deserializing object

            Employee emp = null;
            FileInputStream fileInputStream = new FileInputStream("EmployeeObj.txt");
            ObjectInput inputStream = new ObjectInputStream(fileInputStream);
            emp = (Employee)inputStream.readObject();
            fileInputStream.close();
            inputStream.close();
            System.out.println("Object is Deserialized: ");
            System.out.println("Employee Name: "+emp.name);
            System.out.println("Employee Age: "+emp.age);
            System.out.println("Employee Salary: "+emp.salary);
        }
        catch (ClassNotFoundException c){
            c.printStackTrace();

        }
        catch(IOException i){
            i.printStackTrace();

        }

    }
}
