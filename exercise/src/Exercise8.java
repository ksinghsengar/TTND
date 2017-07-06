import java.util.*;
public class Exercise8 {
    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
// Reverse using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        char []ch  = str.toCharArray();
        for (int i = str.length()-1; i>= 0;i--  ){
            stringBuilder.append(ch[i]);
        }

        stringBuilder.replace(4,10,"");
        System.out.println("Using String Builder Reversed String is: "+stringBuilder);

        // Reverse  using StringBuffer
        String strReverse = new StringBuffer(str).reverse().replace(4,10,"").toString();
        System.out.println("Using String Buffer Reverse String is: "+strReverse);

    }
}
