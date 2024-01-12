@FunctionalInterface
interface Phone{
    void Ring();
}
class Base{
    void Print(){
        System.out.println("Hello");
    }
}
class Derived extends Base{
    @Override
    void Print(){
        System.out.println("Hey");
    }
    @Deprecated
    void add(int a,int b){
        System.out.println(a+b);
    }
}
public class Java_Annotation {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Derived obj = new Derived();
        obj.Print();
        obj.add(5,10);
    }
}
