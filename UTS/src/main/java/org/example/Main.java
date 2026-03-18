package org.example;

import com.yunhasnawa.exam.UTSExam;
import com.yunhasnawa.jeutest.ExamData;
import com.yunhasnawa.jeutest.ExamWork;

public class Main extends UTSExam implements ExamWork /* ⚠️ <-- JANGAN UBAH BARIS INI! ⚠️*/
{
    public static void main(String[] args)
    {
        ManajerKegiatan manajer = new ManajerKegiatan();

        // Menambahkan kegiatan
        manajer.tambahKegiatan(new Kegiatan("Nonton film di bioskop", 3));
        manajer.tambahKegiatan(new Kegiatan("Daftar seminar analisis data", 2));
        manajer.tambahKegiatan(new Kegiatan("Telepon ibuk minta tambahan uang saku", 1));
        manajer.tambahKegiatan(new KegiatanKerja("Membuat web dinamis", 2, "Pak Dimas"));
        manajer.tambahKegiatan(new TugasKuliah("Membuat database PBL", 2, Alat.konversiKeTanggal("01-11-2024"), "Basis Data Lanjut"));
        manajer.tambahKegiatan(new KegiatanMendesak("Mengantar nenek ke rumah sakit"));

        // Menampilkan semua kegiatan
        manajer.tampilkanSemuaKegiatan();

        // Menandai kegiatan sebagai selesai
        manajer.selesaikanKegiatan("Daftar seminar analisis data");

        // Menampilkan kegiatan yang selesai
        manajer.tampilkanKegiatanSelesai();

        // Menampilkan kegiatan yang belum selesai
        manajer.tampilkanKegiatanBelumSelesai();

      manajer.getJumlahKegiatanBelumSelesai();


        /* ----------------------------------------------------------------------- */
        /* Kode untuk memeriksa pekerjaan Anda. Jangan mengubah kode di bawah ini! */
        /* ----------------------------------------------------------------------- */
        Main mainClass = new Main();
        mainClass.check();
        /* ----------------------------------------------------------------------- */
    }

    @Override
    public ExamData getExamData()
    {
        return new ExamData(
                "Hamdan Azizul Hakim",          // <-- Ganti dengan Nama Anda!
                "2341720251",                             // <-- Ganti dengan NIM Anda!
                "TI-2G",                                 // <-- Ganti dengan nama kelas Anda!
                "http://34.82.192.248/jeutest-server/"  // <-- JANGAN UBAH BARIS INI! ⚠️
        );
    }
}