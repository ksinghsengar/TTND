import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//Using IntStream
        System.out.println("Print table using IntStream: ");
        IntStream.rangeClosed(1,10).forEach(e-> System.out.println(e*num));
//Using List
        System.out.println("Print table using List: ");
                List Table = list.stream()
                        .map(e->e*num)
                        .collect(Collectors.toList());

        System.out.println(Table);



    }
}
