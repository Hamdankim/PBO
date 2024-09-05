public class Mobil {
    private String merek;
    private String warna;
    private int tahunPembuatan;

    public Mobil(String merek, String warna, int tahunPembuatan) {
        this.merek = merek;
        this.warna = warna;
        this.tahunPembuatan = tahunPembuatan;
    }

    public void  nyalakan()
    {
        System.out.println("Greeng!!!");
    }

    public void jalan()
    {
        System.out.println("Breemm!!! Mobil "+this.merek+" warna "+this.warna+" berjalan di jalan raya");
    }

}
