/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J10;

/**
 *
 * @author NADILA
 */
public class TugasPraktikum3 {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][3];
        
        arrayMulti[0][0] = 1;
        arrayMulti[0][1] = 3;
        arrayMulti[0][2] = 5;
        
        arrayMulti[1][0] = 2;
        arrayMulti[1][1] = 4;
        arrayMulti[1][2] = 6;
        
        //MENAMPILKAN ISI ARRAY MULTIDEMENSI
        for(int x = 0; x <= 1; x++)
        {
            for(int y = 0; y <= 2; y++)
            {
                System.out.format("arrayMulti[%d][%d] = %d %n", x, y, arrayMulti[x][y]);
            }
        }
    }
}
