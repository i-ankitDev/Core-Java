import java.util.HashMap;
import java.util.Map;

public class MaxAndMinArrayElementsUsingMap {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,2};
        Map<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else {
                hm.put(arr[i],1);
            }
        }
        int max = 0;
        int min = 1;
        for (Map.Entry<Integer,Integer> m: hm.entrySet()) {
           if (max<m.getValue()){
               max = m.getValue();
           }
           if (min>m.getValue()){
               min = m.getValue();
           }
            if (m.getValue()==max){
                System.out.println("Maximum occurring elements : "+m.getKey() + " : "+m.getValue());
            }
            if (m.getValue()==min){
                System.out.println("Minimum occurring elements : "+m.getKey() + " : "+m.getValue());
            }
        }
        for (Map.Entry<Integer,Integer> m: hm.entrySet()) {

        }
    }
}
