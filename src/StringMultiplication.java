public class StringMultiplication {
    public static void main(String[] args) {
        String str = "jay6";
        String newStr="";
        int number=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                newStr =  newStr+str.charAt(i) ;
            }
            else {
                 number = Character.getNumericValue(str.charAt(i));
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.print(newStr);
        }

    }
}
