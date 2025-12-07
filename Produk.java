package pewarisan;

public class Produk {
    protected String judul;
    protected String penulis;

    public Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getInfoProduk() {
        return "Judul: " + judul + ", Penulis: " + penulis;
    }
}

