import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] rarr = new int[n];
        for (int i = 0; i < n; i++) {
            rarr[i] = arr[i];
        }
        int k = 3;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[k];
            k++;
            if (k==arr.length-1){
                break;
            }
        }
        int j = 0;
        for (int i = arr.length-rarr.length; i < arr.length; i++) {
            arr[i] = rarr[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
