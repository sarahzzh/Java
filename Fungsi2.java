import java.util.Scanner;

public class Fungsi2 {
    public static void main(String[] args) {
        //fungsi hitung

        Scanner userInput = new Scanner(System.in);

        System.out.print("panjang = ");
        int inputPanjang = userInput.nextInt();
        System.out.print("lebar = ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang,inputLebar);

        System.out.println("Luas =" + luas(inputPanjang,inputLebar));
        System.out.println("keliling =" + keliling(inputPanjang,inputLebar));

        nilai(inputPanjang,inputLebar);
    }

    //fungsi menampilkan nilai
    public static void nilai (int panjang, int lebar){
        System.out.println("menghitung luas dan keliling");
        System.out.println("luas =" + luas(panjang,lebar));
        System.out.println("keliling =" + keliling(panjang,lebar));
    }

    //fungsi
    public static int luas (int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }

    //fungsi keliling
    public static int keliling (int panjang, int lebar){
        int hasil = (panjang+lebar) * 2;
        return hasil;
    }

    //fungsi
    public static void gambar (int panjang, int lebar){
        for (int i=0; i<lebar; i++){
            for (int x=0; x<panjang; x++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
