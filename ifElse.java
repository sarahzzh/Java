import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);

        //input
        System.out.print("Nama : ");
        nama = scan.nextLine();
        System.out.print("Nilai : ");
        nilai = scan.nextInt();

        //if else
        if (nilai > 70){
            System.out.println("Selamat" + " " + nama + " " + "Anda Lulus !!!");
        }else if (nilai == 70){
            System.out.println("Selamat" + " " + "anda lulus, tingkatkan lagi belajarnya!!");
        } else {
            System.out.println("Maaf" + " " + nama + " " + "Anda gagal, semangat belajar lagi yaa!!!");
        }
    }
}
