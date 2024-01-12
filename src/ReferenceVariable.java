class Qspiders{
    void Development_Course(String name){
        System.out.println(name+" joined successfully");
    }
}
public class ReferenceVariable {
    public static void main(String[] args) {
        Qspiders q = new Qspiders();
        Shanti.join(q);
        Shantanu.join(q);
    }
}
class Shanti{
    static void join(Qspiders a){
        a.Development_Course("Shanti");
    }
}
class Shantanu{
    static void join(Qspiders a){
        a.Development_Course("Shantanu");
    }
}
