public class Data_Buku {
    //attribut
    String judul_buku;
    String pengarang;
    String penerbit;
    int tahun_terbit;
    String alamat_penerbit;
    String no_kontak;

    //method prosedur
    void isi_data1() {
        //isi data
        judul_buku = "Dikta dan Hukum";
        pengarang = "Dhia'an Farah";
        penerbit = "Asoka Aksara X Loveable";
        tahun_terbit = 2021;
        alamat_penerbit = "Jakarta";
        no_kontak = "089765436";
    }

    String getJudul_buku(){
        judul_buku = "Dikta dan Hukum";
        return judul_buku;
    }

    String getPengarang(){
        pengarang = "Dhia'an Farah";
        return pengarang;
    }

    String getPenerbit(){
        penerbit = "Asoka Aksara X Loveable";
        return penerbit;
    }

    int getTahun_terbit(){
        tahun_terbit = 2021;
        return tahun_terbit;
    }

    String getAlamat_penerbit(){
        alamat_penerbit = "Jakarta";
        return alamat_penerbit;
    }

    String getNo_kontak(){
        no_kontak = "089765436";
        return alamat_penerbit;
    }
}


