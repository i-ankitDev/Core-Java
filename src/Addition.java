public class Addition {
    void Add(int a,int b){
        System.out.println(a+b);
    }
    void Add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Addition a = new Addition();
        a.Add(10,20);
        a.Add(10,20,30);
    }
}
