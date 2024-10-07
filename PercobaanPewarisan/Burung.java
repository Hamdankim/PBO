package PercobaanPewarisan;

public class Burung extends EntitasTerbang 
{
    private float panjangParuh;

    public Burung(String nama, int jumlahSayap) 
    {
        super(nama, jumlahSayap);

        this.panjangParuh = 1;
    }

    public void bersuara() 
    {
        System.out.println("burung bersuara cit....cuit");
    }

}
