/**
 * Created by krishan on 6/21/2017.
 */
import java.util.Scanner;
public class Exercise3 {

            public static void main(String args[])
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter String :");
            String input = sc.nextLine();
            System.out.println("Enter The Character To Find : ");
            String ch = sc.nextLine();


            int count= input.length() - input.replaceAll(ch,"").length() ;
            System.out.println("count = " + count);
            System.out.println(input.replaceAll(ch,""));

        }

    }

