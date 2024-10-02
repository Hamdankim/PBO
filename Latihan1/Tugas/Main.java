package Tugas;

public class Main {
    public static void main(String[] args) {
        Tugas4 brg1 = new Tugas4();
        brg1.kode = "BRG001";
        brg1.namaBarang = "Pensil";
        brg1.hargaDasar = 1000;
        brg1.diskon = 10;
        brg1.tampilData();
        System.out.println("============================");
        Lingkaran l1 = new Lingkaran();
        l1.phi = 3.14;
        l1.r = 14;
        System.out.println("Luas Lingkaran : " + l1.hitungLuas());
        System.out.println("Keliling Lingkaran : " + l1.hitungKeliling());
        System.out.println("============================");
        Persewaan p1 = new Persewaan();
        p1.id = "001";
        p1.namaMember = "Joko";
        p1.namaGame = "PUBG";
        p1.lamaSewa = 3;
        p1.harga = 50000;
        p1.tampilData();
    }
}
