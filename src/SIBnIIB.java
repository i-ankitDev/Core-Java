public class SIBnIIB {
    SIBnIIB(){
        System.out.println("I am constructor");
    }
    static
    {
        System.out.println("SIB1");
    }
    static
    {
        System.out.println("SIB2");
    }
    {
        System.out.println("IIB");
    }
    static
    {
        System.out.println("SIB2");
    }

    public static void main(String[] args) {
        System.out.println("Starts");
        SIBnIIB s = new SIBnIIB();
        System.out.println("Ends");
    }
    static {
        System.out.println("I am sib");
    }
}
