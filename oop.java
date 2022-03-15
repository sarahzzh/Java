public class oop {
    //class & method

    public static void main(String[] args) {
        //instansiasi object
        student Student1 = new student();
        Student1.nama = "sarah";
        Student1.stream = "QA";
        Student1.usia = 19;
        Student1.nilai = 100;

        System.out.println(Student1.nama);
        System.out.println(Student1.stream);
        System.out.println(Student1.usia);
        System.out.println(Student1.nilai);
    }
}

//class = template
class student{
    String nama;
    String stream;
    int usia;
    double nilai;
}