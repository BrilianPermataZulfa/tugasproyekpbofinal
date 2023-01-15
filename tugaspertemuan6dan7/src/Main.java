import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("||                                         ||");
        System.out.println("||    APLIKASI KURSUS BAHASA INGGRIS       ||");
        System.out.println("||                                         ||");
        System.out.println("=============================================");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int pilih;
        System.out.println("=============== Daftar Siswa ================");
        Siswabelumlulus siswa1 = new Siswabelumlulus(12345, "Permata Brilian Zulfa ");
        System.out.println("NIS           : " + siswa1.nis);
        System.out.println("NAMA          : " + siswa1.nama);
        System.out.println("STATUS        : " + siswa1.jenis());
        System.out.println("DESKRIPSI     : " + siswa1.deskripsi());
        System.out.println("NO IJAZAH     : " + siswa1.ijazah(111111));
        System.out.println();

        Siswasudahlulus siswa2 = new Siswasudahlulus(67890, "Brilian Permata Zulfa");
        System.out.println("NIS           : " + siswa2.nis);
        System.out.println("NAMA          : " + siswa2.nama);
        System.out.println("STATUS        : " + siswa2.jenis());
        System.out.println("DESKRIPSI     : " + siswa2.deskripsi());
        System.out.println("NO IJAZAH     : " + siswa2.ijazah(111112));
        System.out.println();

        System.out.println("Lanjutkan Mengisi Data Kursus");
        System.out.println("1. Iya");
        System.out.println("2. Tidak");
        System.out.println("Pilih :  ");
        pilih = input.nextInt();
        if (pilih == 1) {

            Pengajar Pengajar = new Pengajar();
            Pengajar.input_data();
            Pengajar.update_data();

            Pelanggan Pelanggan = new Pelanggan();
            Pelanggan.input_data();
            Pelanggan.lihat_data();
            System.out.println();

            Petugas Petugas = new Petugas();
            Petugas.input_data();
            Petugas.update_data();
            Kursusbahasainggris Kursusbahasainggris = new Kursusbahasainggris();
            Kursusbahasainggris.input_data();
            Kursusbahasainggris.jenis_kelas();
            Kursusbahasainggris.update_data();
        } else if (pilih == 2) {
            System.exit(0);
        } else {
            System.out.println("INVALID !!!");
        }


        //MODIFIKASI PROGRAM CLASS ABSTRACT
        System.out.println("========================================================");
        System.out.println("          MENU PEMBAYARAN                |     HARGA    ");
        System.out.println("1. Kursus Bahasa Inggris Privat          |   Rp 650000  ");
        System.out.println("2. Kursus Bahasa Inggris Reguler         |   Rp 350000  ");
        System.out.println("========================================================");
        System.out.println("Masukan Pilihan Anda = ");
        pilih = input.nextInt();
        System.out.println();
        if (pilih == 1) {
            PembayaranKursus pk = new PembayaranKursus(650000);
            System.out.println("Total Bayar : " + pk.pembayaran());
        } else if (pilih == 2) {
            PembayaranKursus pk = new PembayaranKursus(350000);
            System.out.println("Total Bayar : " + pk.pembayaran());
        }

        JumlahSlot js = new JumlahSlot();
        int jumlah, kursi;
        System.out.println("Masukan Jumlah Kelas : ");
        jumlah = input.nextInt();
        System.out.println("Masukan Jumlah Kursi : ");
        kursi = input.nextInt();
        System.out.println();
        System.out.println("Jumlah Slot : "+js.jumlahKelas(jumlah,kursi));

        bacaFile y = new bacaFile();
        y.j();


    }

}