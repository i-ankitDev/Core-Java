import java.util.ArrayList;
import java.util.Scanner;
public class PSQ1_ArrayList {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        for (int i = 1; i<=10;i++){
            System.out.println("Enter the Name "+i+" : ");
            name.add(sc.nextLine());
        }
        for (String element: name) {
            System.out.println("Name is "+element);
        }

    }
}
