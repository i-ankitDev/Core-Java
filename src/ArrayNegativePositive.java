import java.util.ArrayList;

public class ArrayNegativePositive {
    public static void main(String[] args) {
        int[] arr = {2,6,54,7,-7,-8,2,-9,1,-80};
        ArrayList<Integer> Positive_Array = new ArrayList<>();
        ArrayList<Integer> Negative_Array = new ArrayList<>();
        for (int i= 0;i<arr.length;i++){
            if (arr[i]>0){
                Positive_Array.add(arr[i]);
            }
            else {
                Negative_Array.add(arr[i]);
            }
        }
        System.out.println(Positive_Array.toString());
        System.out.println(Negative_Array.toString());
    }
}
