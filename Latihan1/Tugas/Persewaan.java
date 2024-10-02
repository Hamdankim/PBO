package Tugas;

public class Persewaan {
    public String id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public int harga;

    public int hitungHarga() {
        return this.harga * this.lamaSewa;
    }

    public void tampilData() {
        System.out.println("ID Member : " + this.id);
        System.out.println("Nama Member : " + this.namaMember);
        System.out.println("Nama Game : " + this.namaGame);
        System.out.println("Lama Sewa : " + this.lamaSewa);
        System.out.println("Harga Bayar : " + this.hitungHarga());
    }
}
