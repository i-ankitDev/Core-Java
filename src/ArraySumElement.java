public class ArraySumElement {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,3,6,4};
        int i = 0;
        int target = 6;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j]+arr[i]==target && arr[j] != target) {
                System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                arr[j] = 0;
                i++;
                j = i;
            }
        }
    }
}
