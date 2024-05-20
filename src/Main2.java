class MyException extends Exception {
    @Override
    public String getMessage() {
        return "Not eligible";
    }
}
public class Main2 {
    public static void main(String[] args) throws MyException {
        int age = 17;
        checkAge(age);
    }
    static void checkAge(int age) throws MyException{
        if (age <= 18) {
            throw new MyException();
        }
        else {
            System.out.println("Eligible");
        }
    }
}
