package PercobaanPewarisan;

public class KendaraanUdara  extends EntitasTerbang
{
    protected int jumlahMesin;
    protected int kapasitasPenumpang;

    public KendaraanUdara(String nama, int jumlahSayap, int jumlahMesin, int kapasitasPenumpang) {
        super(nama, jumlahSayap);
        this.jumlahMesin = jumlahMesin;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
    
   public void lakukanPerawatanBerkala()
   {
    //    System.out.println("Perawatan berkala dilakukan");
   }

}
