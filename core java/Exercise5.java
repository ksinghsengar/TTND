import java.util.Scanner;

public class Exercise5 {
 
    public static void main(String args[]){
        System.out.print("Enter the no. of elements in Array1: ");
        Scanner scanner = new Scanner(System.in);
        int arr1_length = scanner.nextInt();
        int arr1[] = new int[arr1_length];
        System.out.println("Enter the elements in Array1: ");
        for(int i= 0; i < arr1_length; i++)
        {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the no. of elements in Array2: ");
        int arr2_length = scanner.nextInt();
        int arr2[] = new int[arr2_length];
        System.out.println("Enter the elements in Array2: ");
        for(int i= 0; i < arr2_length; i++)
        {
            arr2[i] = scanner.nextInt();
        }

        System.out.println("Common elements are: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}