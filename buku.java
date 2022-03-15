public class buku {
    //method main

    public static void main(String[] args) {
        //panggil class Data_Buku
        Data_Buku buku1 = new Data_Buku();
        System.out.println("Data Buku 1");
        System.out.println("Judul Buku : " + buku1.getJudul_buku());
        System.out.println("Nama Pengarang :" + buku1.getPengarang());
        System.out.println("Diterbitkan pada tahun :" + buku1.getTahun_terbit());
        System.out.println("Diterbitkan Oleh :" + buku1.getPenerbit());
        System.out.println("Alamat Penerbit :" + buku1.getAlamat_penerbit());
        System.out.println("Kontak Penerbit :" + buku1.getNo_kontak());
    }
}
