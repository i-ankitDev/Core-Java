import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,7,8};
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < 1; j++) {
                swap(arr,i, arr.length-1);
            }

//            for (int j = arr.length-1; j > 0; j--) {
//                if (flag==true) {
//                    swap(arr, j, j - 1);
//                    flag = false;
//                }
//            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr [a];
        arr [a] = arr[b];
        arr [b] = temp;
    }
}
