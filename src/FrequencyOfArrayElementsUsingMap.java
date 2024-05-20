import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElementsUsingMap {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
       HashMap<Integer,Integer> m = new HashMap<>();
       for (int i = 0;i<arr.length;i++){
           if (m.containsKey(arr[i])){
               m.put(arr[i],m.get(arr[i])+1);
           }
           else {
               m.put(arr[i],1);
           }
       }
        System.out.println(m);
    }
}
