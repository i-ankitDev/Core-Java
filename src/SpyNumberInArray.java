public class SpyNumberInArray {

    static boolean isSpy(int no){
        return sumOfDigits(no) == productOfDigits(no);
    }
    static int sumOfDigits(int no){
        int sum = 0;
        while (no>0){
            int rem = no%10;
            sum = sum+rem;
            no/=10;
        }
        return sum;
    }
    static int productOfDigits(int no){
        int product = 1;
        while (no>0){
            int rem = no%10;
            product = product*rem;
            no/=10;
        }
        return product;
    }
    public static void main(String[] args) {
        int[] arr = {132,1124,173,625,732};
        for (int i : arr) {
            if (isSpy(i)) {
                System.out.println(i + " is a spy number");
            }
        }
    }
}
