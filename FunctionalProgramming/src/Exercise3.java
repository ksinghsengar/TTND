import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Exercise3 {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.name = "Ram";
        e.age = 27;
        e.salary = 50000;

        Field[] fields = e.getClass().getDeclaredFields();
        System.out.println("Fields are: ");
        for (Field field:fields)
        {
            System.out.println(field.getType()+" "+field.getName());
        }
        System.out.println("Methods are: ");
        Method[] methods = e.getClass().getDeclaredMethods();
        for (Method method :methods) {
            if(Modifier.isPublic(method.getModifiers())){
                System.out.print( " Public ");
            }
            else if(Modifier.isProtected(method.getModifiers())){
                System.out.print( " Protected ");
            }
            else if(Modifier.isPrivate(method.getModifiers())){
                System.out.print( " Private ");
            }
            System.out.println(method.getName());

        }
    }
}


