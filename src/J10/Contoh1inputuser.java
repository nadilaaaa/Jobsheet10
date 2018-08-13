/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J10;
import java.util.Scanner;
/**
 *
 * @author NADILA
 */
public class Contoh1inputuser {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        String[] nama = new String[5];
        
        
        //LOOPING FOR UNTUK INPUT ELEMEN NAMA
        for (int i = 0; i < 5; i++) {
        System.out.print("Masukkan Nama Siswa ke- " + (i + 1) + " : ");
        nama[i] = baca.nextLine();
        
            System.out.println(""
                    + ""
                    + ""
                    + "");
            
        }
        
        //LOOPING FOR UNTUK MENAMPILKAN ELEMEN NAMA
        for (int i = 0; i < 5; i++) {
            System.out.println("Siswa ke-" + (i + 1) + " " + nama[i]);
        }
    }
}
