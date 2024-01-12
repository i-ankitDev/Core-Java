public class NeonNumber {
    static int sumOfDigits(int no){
        int sum= 0;
        while (no>0){
            int rem = no%10;
            sum = sum+rem;
            no= no/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int no = 45;
        int sqr = no*no;
        int sod = sumOfDigits(sqr);
        if (no == sod){
            System.out.println(no+ " is a neon number");
        }
        else {
            System.out.println(no+" is not a neon number");
        }
    }
}
