package PercobaanPewarisan;

public class EntitasTerbang {
    protected String nama;
    protected int jumlahSayap;

    public EntitasTerbang(String nama, int jumlahSayap) {
        this.nama = nama;
        this.jumlahSayap = jumlahSayap;
    }

    public void terbang() {
        // System.out.println("Hewan " + this.nama + " sedang terbang");
    }

    public void mendarat() {
        // System.out.println("Hewan " + this.nama + " sedang mendarat");
    }
}
