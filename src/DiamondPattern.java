public class DiamondPattern {
    public static void main(String[] args) {
      int n = 7;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n; j++) {

                 if ((j<=3) && (i+j<=n+1) && (i+j) % 2==0 ){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
