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
public class Contoh2 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        double[] bilangan = new double[5];
        double total = 0;
        double max;
        double min;
        
        
        for (int x = 0; x < 5; x++) {
        System.out.print("Masukkan Angka ke-" + (x + 1) + " : ");
        bilangan[x] = baca.nextDouble();
        }
        
        for(int i = 0; i < bilangan.length; i++)
        {
            total += bilangan[i];
        }
        
        System.out.println("Rata-rata: " + (total/bilangan.length));
        
        //BILANGAN TERBESAR
        max = bilangan[0];
        for(int i = 1; i < 5; i++)
        {
            if(bilangan[i] > max){
                max = bilangan[i];
            }
        }
        System.out.println("Nilai Terbesar: " + max);
        
        //BILANGAN TERKECIL
        min = bilangan[0];
        for(int i = 1; i > 5; i++)
        {
            if(bilangan[i] < min) {
                min = bilangan[i];
            }
        }
        System.out.println("Bilangan Terkecil: " + min);
    }
}
