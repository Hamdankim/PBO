package PercobaanPewarisan;

public class KakakTua extends Burung 
{

    public KakakTua(String nama) 
    {
        super(nama, 2);
    }
    
    @Override
    public void terbang() 
    {
        System.out.println("Kakak Tua bernama "+this.nama+" sedang terbang, bek bek bek..");
    }

    @Override
    public void mendarat() 
    {
        super.mendarat();
    }

    public void meniruSuaraManusia() 
    {
        System.out.println("Halooo, saya "+this.nama);
    }
}
