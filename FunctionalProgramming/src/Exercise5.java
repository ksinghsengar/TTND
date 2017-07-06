
 interface Exercise {
   public static int sum(int a, int b){
        System.out.println("Sum is: "+a+b);
        return a+b;
    }
    public default void mul(int a, int b){
        System.out.println("Multiply is: "+a*b);

    }
}

public class Exercise5 implements Exercise{

    public void mul(int a, int b){
       Exercise.super.mul(5,6);
        System.out.println("Multiply default: "+a*b);

   }
    public static void main(String[] args) {

     Exercise5 obj = new Exercise5();
     Exercise.sum(5,6);
     obj.mul(3,4);



    }
}
