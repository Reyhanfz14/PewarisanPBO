package pewarisan;

public class Komik extends Produk {
    protected int jumlahHalaman;

    public Komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public String getInfoProduk() {
        return super.getInfoProduk() + ", Jumlah Halaman: " + jumlahHalaman;
    }
}

