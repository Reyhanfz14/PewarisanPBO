package pewarisan;


public class main {
    public static void main(String[] args) {

        // Soal 1
        Hewan h1 = new HewanBerkakiDua();
        Hewan h2 = new HewanBerkakiEmpat();
        Hewan h3 = new HewanBerkakiEnam();
        Hewan h4 = new HewanBerkakiDelapan();

        h1.tampilJenis();
        h2.tampilJenis();
        h3.tampilJenis();
        h4.tampilJenis();

        // Soal 2
        HitungSegitiga segitiga = new HitungSegitiga();
        segitiga.tampilLuas();

        // Soal 3
        Kubus kubus = new Kubus();
        System.out.println("Volume Kubus: " + kubus.hitungVolume());

        // Soal 4
        Kucing kucing = new Kucing();
        System.out.println(kucing.display());
        kucing.makan();

        // Soal 5 & 6
        Komik komik = new Komik("Naruto", "Masashi Kishimoto", 200);
        Games game = new Games("Mobile Legends", "Moonton", 10);

        System.out.println(komik.getInfoProduk());
        System.out.println(game.getInfoProduk());
    }
}

