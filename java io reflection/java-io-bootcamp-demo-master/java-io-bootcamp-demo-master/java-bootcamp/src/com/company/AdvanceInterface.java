package com.company;

interface MyInterface{
    public default void display(){

        System.out.println("display");
    }
}

public class AdvanceInterface implements MyInterface{

   public void display(){
       MyInterface.super.display();
       System.out.println("display2");
    }

    public static void main(String[] args) {
        AdvanceInterface advanceInterface= new AdvanceInterface();
        advanceInterface.display();
    }
}
