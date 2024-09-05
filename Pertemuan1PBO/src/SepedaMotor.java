public class SepedaMotor {
    private String merk;
    private int tahunPembuatan;

    public void  nyalakan()
    {
        System.out.println("Greeng!!!");
    }

    public void jalan()
    {
        System.out.println("Breemm!!! Sepeda motor "+this.merk+" berjalan di jalan raya");
    }

    //Konstruktor
    public SepedaMotor(String merk, int tahunPembuatan)
    {
        this.merk = merk;
        this.tahunPembuatan = tahunPembuatan;
    }
}
