package PercobaanPewarisan;

public class Main 
{
    public static void main(String[] args) 
    {
        EntitasTerbang et = new EntitasTerbang("???", 0);
        et.terbang();
        et.mendarat();

        Burung b = new Burung("???", 0);
        b.terbang();
        b.mendarat();
        b.bersuara();

        KakakTua joni = new KakakTua("Joni");
        System.out.println(joni.getClass());
        joni.terbang();
        joni.bersuara();
        joni.mendarat();
        joni.meniruSuaraManusia();


        KendaraanUdara ku = new KendaraanUdara("???", 0, 0, 0);
        ku.terbang();
        ku.mendarat();
        ku.lakukanPerawatanBerkala();

        PesawatTerbang hercules = new PesawatTerbang("Hercules", 2, 4, 60);
        hercules.terbang();
        hercules.mendarat();
    }
}
