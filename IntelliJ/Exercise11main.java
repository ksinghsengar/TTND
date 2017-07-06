public class Exercise11main{
    public static void main(String args[]) {
        Exercise11 obj  = new Exercise11();
        System.out.println("Calling add(int a, int b);");
        System.out.println("Result: "+obj.add(6,8));
        System.out.println("Calling double add(double a, double b);");
        System.out.println("Result: "+obj.add(6.5568787, 8.275768));
        System.out.println("Calling multiplty(float a,float b);");
        System.out.println("Result: "+obj.multiply(0.45,2.1));
        System.out.println("Calling multiply(int a, int b);");
        System.out.println("Result: "+obj.multiply(2,5));
        System.out.println("Calling concate(String a, String b);");
        System.out.println("Result: "+obj.concate("hello ", "world"));
        System.out.println("Calling concate(String a, String b, String c);");
        System.out.println("Result: "+obj.concate("this", " is", " example"));

    }
}