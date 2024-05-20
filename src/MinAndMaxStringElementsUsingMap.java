import java.util.HashMap;
import java.util.Map;

public class MinAndMaxStringElementsUsingMap {
    public static void main(String[] args) {
        String str = "aabbccddd";
        Map<Character,Integer> m = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (m.containsKey(str.charAt(i)) ){
                m.put(str.charAt(i),m.get(str.charAt(i))+1);
            }
            else {
                m.put(str.charAt(i),1);
            }
        }
        int max = 0;
        int min= 1;
        for (Map.Entry<Character,Integer> map:m.entrySet()) {
            if (max<map.getValue() ) {
                max = map.getValue();
            }
            if (min>map.getValue()){
                min = map.getValue();
            }
        }
        for (Map.Entry<Character,Integer> map:m.entrySet()) {
            if (map.getValue()==max)
                System.out.println("Maximum Occurrence : "+map.getKey()+" : "+map.getValue());
            if (map.getValue()==min)
                System.out.println("Minimum Occurrence : "+map.getKey()+" : "+map.getValue());
        }
    }
}
