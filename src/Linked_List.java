import java.util.*;
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(0);
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
//        l1.set(5,600);
        l1.remove(0);
        for (int i = 0;i<l1.size();i++){
            System.out.print(" "+l1.get(i));
        }
        System.out.println("\n"+l1.size());
    }
}
