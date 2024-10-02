package Percobaan3;

public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;

    public void tampilBarang() {
        System.out.println("Nama Barang : " + this.namaBrg);
        System.out.println("Jenis Barang : " + this.jenisBrg);
        System.out.println("Stok : " + this.stok);
    }

    public int tambahStok(int brgMasuk) {
        int stokBaru = this.stok + brgMasuk;
        return stokBaru;
    }
}
