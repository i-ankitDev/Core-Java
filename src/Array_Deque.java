import java.util.*;
public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> obj1= new ArrayDeque<>();
        obj1.add(5);
        obj1.add(10);
        obj1.add(15);
        obj1.add(20);
        obj1.add(25);
        System.out.println(obj1);
        obj1.addFirst(0);
        obj1.addLast(35);
        System.out.println(obj1);
        obj1.removeFirst();
        obj1.removeLast();
        System.out.println(obj1);
    }
}
