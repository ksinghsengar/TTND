package com.company;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Employee employee= new Employee();
        employee.name = "Peter";
        employee.address = "New York";
        employee.number = 101;

        Field [] fields = employee.getClass().getDeclaredFields();
        for(Field field: fields){
            System.out.println(field.getType()+"--"+field.getName());
        }


        Method[] methods= employee.getClass().getDeclaredMethods();
        for (Method field : methods ){
            System.out.println(field.getName());
            System.out.println(field.getModifiers());
            System.out.println(Modifier.isPublic(field.getModifiers()));
        }

        // invoking method at runtime
        Method method = employee.getClass().getDeclaredMethod("setName",new Class[]{String.class});
        method.invoke(employee,"John");
        System.out.println(employee.getName());
    }
}

