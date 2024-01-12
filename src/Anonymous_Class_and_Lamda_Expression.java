@FunctionalInterface
interface Exp{
    void meth();
}
abstract class Exp1{
    abstract void print();
}
@FunctionalInterface
interface LamdaExp{
    void printVal(int a, int b);
}
public class Anonymous_Class_and_Lamda_Expression {
    public static void main(String[] args) {
        Exp obj = new Exp() {
            @Override
            public void meth() {
                System.out.println("Hello");
            }
        };
        Exp1 obj2 = new Exp1() {
            @Override
            void print() {
                System.out.println("Hey");
            }
        };
        LamdaExp obj3 = (a,b)->{
            System.out.println("Value of A is "+a+" and B is "+b);
        };
        obj.meth();
        obj2.print();
        obj3.printVal(10,30);
    }
}
