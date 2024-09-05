//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Membaca input dari parameter
        double hutang = Double.parseDouble(args[0]);
        float bunga = Float.parseFloat(args[1]);
        int jumlahCicilan = Integer.parseInt(args[2]);

        // Tampilkan data input
        System.out.println("Hutang: " + hutang);
        System.out.println("Bunga: " + bunga);
        System.out.println("Jumlah Cicilan: " + jumlahCicilan);

        // Menghitung total yang harus dibayar
        double totalBayar = hutang+(hutang*bunga/100);

        // Jumlah yang harus dibayarkan tiap cicilan
        double angsuran = totalBayar/jumlahCicilan;

        // Tampilkan total bayar dan angsuran
        System.out.println("==========================");
        System.out.println("Total Bayar: " + totalBayar);
        System.out.println("Angsuran: " + angsuran);
        System.out.println("==========================");

        // Tampilkan tabel
        System.out.println("+---------------+--------------+---------------+");
        System.out.println("| Angsurang Ke- | Jumlah Bayar | Sisa Pinjaman |");
        System.out.println("+---------------+--------------+---------------+");
        for (int i = 0; i < jumlahCicilan; i++) {
            System.out.printf("|%15d|%14.1f|%15.1f|\n", (i+1), angsuran, (totalBayar-=angsuran));
            System.out.println("+---------------+--------------+---------------+");
        }

    }
}