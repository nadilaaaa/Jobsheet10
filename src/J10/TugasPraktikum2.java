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
public class TugasPraktikum2 {
    public static void main(String[] args) {
        int[] bil = new int[6];
        
        Scanner baca = new Scanner(System.in);
        
        
        for (int x = 0; x < 6; x++) {
        System.out.print("Masukkan Angka ke-" + (x + 1) + " : ");
        bil[x] = baca.nextInt();
        }
        
         System.out.println("Bilangan ganjil: ");
        for(int z = 0; z < bil.length; z++)
        {
            if(bil[z] % 2 != 0){
                System.out.println( bil[z]);
            }
        }
        
        System.out.println("Bilangan genap: ");
        for(int i = 0; i < bil.length; i++)
        {
            if(bil[i] % 2 == 0){
            System.out.println(bil[i] + " ");
         }   
        }
    }
}
   
        
    

