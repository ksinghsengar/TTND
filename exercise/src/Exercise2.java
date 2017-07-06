import java.util.Scanner;

public class Exercise2 {
    Scanner sc=new Scanner(System.in);
    void getDuplicateWords(){
        String str;
        System.out.println("Enter a String");
        str=sc.nextLine();
        int count = 0;
        String[] str1= str.split("\\s");
        System.out.println("Duplicate words are:-");
        for(int i=0;i<str1.length;i++) {
            if (str1[i] != null) {
                count = 1;
                for (int j = i + 1; j < str1.length; j++) {

                    if (str1[i].equals(str1[j])) {
                        str1[j] = null;
                        count++;

                    }

                }
                if(count > 1)
                    System.out.println(str1[i] + " occured " + count + " times ");
            }
        }
    }

    public static void main(String[] args){
        Exercise2 obj=new Exercise2();
        obj.getDuplicateWords();

    }
}
