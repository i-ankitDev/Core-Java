class Student{
    static String s = "Java";
    int syllabus_cover;
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.syllabus_cover = 20;
        System.out.println("Student 1 cover "+s1.syllabus_cover+" %"+s+" syllabus");
        Student s2 = new Student();
        s2.syllabus_cover = 80;
        System.out.println("Student 2 cover "+s2.syllabus_cover+" %"+s+" syllabus");
    }
}