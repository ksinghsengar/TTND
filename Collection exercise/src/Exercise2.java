import java.util.*;

public class Exercise2 {

    void occurence (String str) {
        Map<Character, Integer> occ = new LinkedHashMap<Character, Integer>();
        for (char c : str.toCharArray()) {

            if (!occ.containsKey(c)) {
                occ.put(c, 1);
            } else {
                occ.put(c, occ.get(c) + 1);
            }

        }
        System.out.println("Unique Characters are: ");
        for (Map.Entry<Character,Integer> entry : occ.entrySet()) {

            if (entry.getValue() == 1)
                System.out.println(entry.getKey());
        }
    }
}

class Occure
{
    public static void main(String[] args) {
        Exercise2 obj  = new Exercise2();
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        obj.occurence(str);
    }
}
