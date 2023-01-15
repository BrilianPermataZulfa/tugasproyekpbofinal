import java.util.Scanner;

public class bacaFile {
    void j(){
        java.io.File file = new java.io.File("pelanggan.txt");
        try{
            Scanner in = new Scanner(file);
            in.useDelimiter("\n");
            String id_pelanggan = in.next();
            String nama = in.next();
            String no_hp = in.next();

            System.out.println("ID Pelanggan : "+id_pelanggan);
            System.out.println("Nama : "+nama);
            System.out.println("No HP : "+no_hp);
        }catch (Exception e){
            System.out.println("File Tidak Ditemukan !");
        }

    }
}
