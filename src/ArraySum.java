public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {5,20,5,45,12,4};
        int arrSum=sum(arr);
        System.out.println(arrSum);
    }
    static int sum(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];
        }
        return sum;
    }
}
