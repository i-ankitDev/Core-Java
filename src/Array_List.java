import java.util.*;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(60);
        l2.add(70);
        l2.add(80);
        l2.add(90);
        l1.add(0);
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.addAll(0,l2);
        for (int i = 0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println(l1.contains(60));

    }
}
