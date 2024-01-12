public class ArrayOddEven {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==1) {
                oddSum = oddSum + odd(arr[i]);
            }
            if (arr[i]%2==0){
               evenSum = evenSum + even(arr[i]);
            }
        }
        System.out.println("Odd : "+oddSum);
        System.out.println("Even : "+evenSum);
    }
    static int odd(int a){
        int sum = 0;
        sum = sum + a;
        return sum;
    }
    static int even(int a){
        int evenSum = 0;
        evenSum = evenSum + a;
        return evenSum;
    }
}
