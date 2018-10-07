/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasproject1;
import java.util.Scanner;
/**
 *
 * @author Lo_William
 */
public class TugasProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi
        Scanner input = new Scanner(System.in);
        int jam_berapa,menit_berapa,detik_keberapa,totdetik,jam1,menit1,detik1;
        //Input
        System.out.print("Jam : ");
        jam_berapa=input.nextInt();
        System.out.print("Menit : ");
        menit_berapa=input.nextInt();
        System.out.print("Detik : ");
        detik_keberapa=input.nextInt();
        //Proses hitung
        jam1=jam_berapa*3600;
        menit1=menit_berapa*60;
        detik1=jam1+menit1+detik_keberapa;
        //Output
        System.out.println();
         System.out.println("Menghitung Total Detik ");
          System.out.println(jam_berapa+" jam "+menit_berapa+" menit "+detik_keberapa+" detik "+"="+detik1+" Detik ");
    }
    
}
