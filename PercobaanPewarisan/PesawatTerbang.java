package PercobaanPewarisan;

public class PesawatTerbang extends KendaraanUdara {

    public PesawatTerbang(String nama, int jumlahSayap, int jumlahMesin, int kapasitasPenumpang) 
    {
        super(nama, jumlahSayap, jumlahMesin, kapasitasPenumpang);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void terbang() 
    {
        System.out
                .println("Pesawat " + this.nama + " sedang terbang membawa " + this.kapasitasPenumpang + " penumpang");
    }

    @Override
    public void mendarat() 
    {
        System.out.println("Pesawat " + this.nama + " sedang mendarat dengan selamat dan mematikan "+ this.jumlahMesin + " mesin");
    }

}
