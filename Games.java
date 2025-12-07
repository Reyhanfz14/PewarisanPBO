package pewarisan;

public class Games extends Produk {
    protected int waktuMain;

    public Games(String judul, String penulis, int waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    @Override
    public String getInfoProduk() {
        return super.getInfoProduk() + ", Waktu Main: " + waktuMain + " Jam";
    }
}

