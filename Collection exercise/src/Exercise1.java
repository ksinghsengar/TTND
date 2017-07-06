import java.util.*;
public class Exercise1 {

    public static void main(String[] args) {
        float sum = 0;
        List<Float> list = new ArrayList<Float>();
        list.add(new Float(3.4));
        list.add(new Float(2.4));
        list.add(new Float(1.7));
        list.add(new Float(3.9));
        list.add(new Float(3.0));

        Iterator<Float> itr = list.iterator();
        System.out.println("List contains: ");
        System.out.println(list);
        while(itr.hasNext())
        {
          Float num = itr.next();
          sum += num;
        }

        System.out.println("Sum of Float Numbers: "+sum);

    }
}
