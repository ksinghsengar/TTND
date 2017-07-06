/**
 * Created by krishan on 6/20/2017.
 */
    /*11.	Write a single program for following operation using overloading
A) Adding 2 integer number
B) Adding 2 double
C) Multipling 2 float
d) Multipling 2 int
E) concate 2 string
F) Concate 3 String*/

    class Exercise11
    {
        public
        int add(int a,int b)
        {
            return a+b;
        }

        double add(double a, double b)
        {
            return a+b;
        }

        float multiples(float a, float b)
        {
            return a*b;
        }

        int multipl(int a, int b)
        {
            return a*b;
        }

        String concate(String a, String b)
        {
            return a+b;
        }

        String concate(String a, String b, String c)
        {
            return a+b+c;
        }

    }