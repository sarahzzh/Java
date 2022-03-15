public class Fungsi {
    public static void main(String[] args) {
        Fungsilagi( "test input");
        Helloworld("aulia");
        Helloworld("cindy");
        System.out.println(test());
    }

    //fungsi
    public static void Helloworld(String nama){
        System.out.println("Halo Selamat Pagi" + nama);
    }

    //fungsi2
    public static void Fungsilagi(String inputan){
        System.out.println(inputan);
    }

    //fungsi3
    public static float test(){
        return 15.5f;
    }
}
