package Tugas;

public class Tugas4 {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    public int hitungHargaJual() {
        return (int) (this.hargaDasar - ((this.diskon/100) * this.hargaDasar));
    }

    public void tampilData() {
        System.out.println("Kode Barang : " + this.kode);
        System.out.println("Nama Barang : " + this.namaBarang);
        System.out.println("Harga Dasar : " + this.hargaDasar);
        System.out.println("Diskon : " + this.diskon);
        System.out.println("Harga Jual : " + this.hitungHargaJual());
    }
}
