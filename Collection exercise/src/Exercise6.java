import java.util.*;

class Freq {

    public static final Comparator<Map.Entry<Integer,Integer>> FrequencyComparator = new Comparator<Map.Entry<Integer,Integer>>() {
        @Override
        public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
            return (o2.getValue() - o1.getValue());
        }
    };
}
public class Exercise6 {
    public static void main(String[] args) {
        Freq obj = new Freq();
        System.out.println("Enter the no. of elements in array: ");
        Scanner sc = new Scanner(System.in);
        Integer size = sc.nextInt();
        int ele;
        Map<Integer, Integer> occ = new LinkedHashMap<Integer,Integer>();
        for (int i = 0; i < size; i++) {
            ele = sc.nextInt();

            if (!occ.containsKey(ele)) {
                occ.put(ele, 1);
            } else {
                occ.put(ele, occ.get(ele) + 1);
            }
        }

        System.out.println("Map Contains: "+occ);
        List list = new ArrayList(occ.entrySet());
        Collections.sort(list,Freq.FrequencyComparator);
        System.out.println("After Sorting: "+list);

    }
}
