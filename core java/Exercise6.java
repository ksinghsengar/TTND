import java.util.Scanner;

public class Exercise6 {
 
    public static void main(String args[]){
        System.out.print("Enter the no. of elements in Array1: ");
        Scanner scanner = new Scanner(System.in);
        int arr1_length = scanner.nextInt();
        int arr1[] = new int[arr1_length];
        int result = 0;
        System.out.println("Enter the elements in Array1: ");
        for(int i= 0; i < arr1_length; i++)
        {
            arr1[i] = scanner.nextInt();
            result ^= arr1[i];
        }
        
        System.out.println("Single element is: "+result);
        
    }
}