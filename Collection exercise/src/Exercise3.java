import java.util.*;

public class Exercise3 {

    void occurence (String str)
    {
        Map<Character,Integer> occ = new HashMap<Character,Integer>();
        for(char c : str.toCharArray())
        {

            if(!occ.containsKey(c))
            {
                     occ.put(c,1);
            }
            else
            {
                     occ.put(c,occ.get(c)+1);
            }

        }
        System.out.println(occ);
    }


}


class Occur
{
    public static void main(String[] args) {
        Exercise3 obj  = new Exercise3();
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        obj.occurence(str);
    }
}
