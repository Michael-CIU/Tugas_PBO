/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject1bag2;
import java.util.Scanner;
/**
 *
 * @author Lo_William
 */
public class TugasProject1bag2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
         //Deklarasi
        Scanner input = new Scanner(System.in);
        float panjangnya,lebarnya,luasnya;
        //Input
        System.out.print("Panjangnya : ");
        panjangnya=input.nextFloat();
        System.out.print("Lebarnya : ");
        lebarnya=input.nextFloat();
        //Proses hitung
        luasnya=panjangnya*lebarnya;
        //Output
        System.out.println();
         System.out.println("Mencoba untuk Menghitung Luas Persegi Panjang");
          System.out.println("Panjangnya : "+panjangnya);
           System.out.println("Lebarnya : "+lebarnya);
            System.out.println("Luasnya30 : "+luasnya);
       
    }
    
}
