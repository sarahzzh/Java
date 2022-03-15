//class contains 2 (data member, method)

class mahasiswa{
    //data
    String nama;
    String NIM;

    //constructor
    mahasiswa(String NIM, String nama){
        this.nama= nama;
        this.NIM = NIM;
        System.out.println("ini constructor");
    }

    //method
    void show(){
        System.out.println("nama: " + this.nama);
    }
}

public class oop2 {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("357901", "sarah");
        mahasiswa mahasiswa2 = new mahasiswa("344567","Azizah");
        mahasiswa1.show();
        mahasiswa2.show();
    }
}
