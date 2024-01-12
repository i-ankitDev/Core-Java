public class SpyNumber {
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
        int no = 1124;
        if (sumOfDigits(no)==productOfDigits(no)){
            System.out.println(no+" is a spy number");
        }
        else {
            System.out.println(no+" is not a spy number");
        }
    }
}
