public class Main {
    public static void main(String[] args) {
        // Variabel dan Tipe data
        int x = 0;
        int y = 1;
        float a = 1.f;
        double b = 2.f;

        // Tipe data primitif vs Non-primitif
        // Tipe data primitif adalah tipe data bawaan Java
        // yang namanya diawali huruf kecil
        // Contohnya: int, float, double, char

        // Tipe data non-primitif disebut juga tipe data objek?
        // Cirinya, namanya diawali huruf kapital
        // Contoh: String
        String nama = "Hamdan Azizul Hakim";
        // Itu sama dengan:
        String nama2 = new String("Hamdan Azizul Hakim");
        // Seharusnya deklarasi variabel dengan tipe data objek
        // seperti di atas.
        // Tapi untuk tipe data objek data tertentu bisa disingkat seolah-olah
        // Dia adalah tipe data primitif.
        // Istilah tersebut dinamakan "Syntatic sugar"

        // Function
        // Adalah sesuatu yang mengolah input menjadi output
        // Menambahkan x dan y
        int hasilTambah = Main.tambah(x, y);

        // Pencabangan
        // Return true jika bilangan pada parameter adalah ganjil, dan false bila
        // sebaliknya.
        int cekAngka = 99;
        boolean isGanjil = Main.isGanjil(cekAngka);

        // Tipe data non-primitif atau objek disimpan di heep dalam komputer

        String namaPembuat = args[0];
        System.out.println("Program ini dibuat oleh " + namaPembuat);
        int angka00 = 0;
        for (int i = 1; i < args.length; i++) {
            angka00 += Integer.valueOf(args[i]);
        }
        int hasilTambahBanyak = tambahBanyakAngka(angka00);
        System.out.println("Hasil Tambah = " + Main.tambah(x, y));
        System.out.println("Hasil Multi Angka = " + hasilTambahBanyak);
        System.out.println("Apakah angka " + cekAngka + " Ganjil? " + isGanjil);
        System.out.println("Jumlah Parameter = " + args.length);

        SepedaMotor spdA = new SepedaMotor("Honda Vario", 2017);
        SepedaMotor spdB = new SepedaMotor("Honda Beat", 2022);

        spdA.nyalakan();
        spdA.jalan();
        spdB.nyalakan();
        spdB.jalan();

        Mobil mbA = new Mobil("Lamborgini", "Merah Muda", 2025);
        Mobil mbB = new Mobil("Alphard", "Hitam", 2010);

        mbA.nyalakan();
        mbA.jalan();
        mbB.nyalakan();
        mbB.jalan();

    }

    public static int tambah(int x, int y) {
        int z = x + y;
        return z;
    }

    public static int tambahBanyakAngka(int... bilangan) {
        int hasil = 0;
        for (int i = 0; i < bilangan.length; i++) {
            hasil += bilangan[i];
        }
        return hasil;
    }

    public static boolean isGanjil(int angka) {
        if (angka % 2 == 0)
            return false;
        else
            return true;
    }
}
