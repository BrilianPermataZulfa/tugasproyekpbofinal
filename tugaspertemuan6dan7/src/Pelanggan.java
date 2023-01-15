import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class Pelanggan {
    int id_pelanggan;
    String nama;
    String no_hp;


    final void input_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("DATA PELANGGAN");
        System.out.println("Masukan ID Pelanggan   : ");
        id_pelanggan=input.nextInt();
        System.out.println("Masukan Nama   :");
        nama= input.next();
        System.out.println("Masukan No HP :");
        no_hp= input.next();
    }


    void lihat_data(){
        java.io.File file = new java.io.File("pelanggan.txt");
                try{
                    PrintWriter output = new PrintWriter(file);
                    output.println(id_pelanggan);
                    output.println(nama);
                    output.println(no_hp);
                    output.close();
                }catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }

    }
}

