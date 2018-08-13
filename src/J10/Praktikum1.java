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
public class Praktikum1 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        String[] nama = new String[] {"Deanne", "Victoria", "Erna", "Nathalie", "Pamela", "Armand", "Omar", "Alvaro", "Ben", "Danny"};
        
        System.out.println("Masukkan Nama Siswa: ");
        String cari = baca.nextLine();
        int flag = 0;
        
        for(int i = 0; i < 10; i++) {
            if(cari.equals(nama[i]))
            {flag = 1;}
        }
        
        if(flag == 1)
        {
            System.out.println("Data Ditemukan");
        }
        else
        {
            System.out.println("Data Tidak Ditemukan");
        }
    }
}