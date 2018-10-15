/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktek2;

import java.util.Scanner;

/**
 *
 * @author Lo_William
 */
public class TugasPraktek2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi
       Scanner input = new Scanner(System.in);
        String nama,alamat,tp;
        int A,B,C,bayar,kembali,harga_total=0;
        // Masukkan
        System.out.print("Nama Anda         : ");
        nama = input.nextLine();
        System.out.print("Alamat  : ");
        alamat = input.nextLine();
        System.out.print("Tipe Pesawat Anda : ");
        tp = input.nextLine();
        System.out.print("Total Bayar        : ");
        bayar = input.nextInt();
        // Pemrosesan
        switch (tp) {
            case "A":
                harga_total = 5000000;
                break;
            case "B":
                harga_total = 2000000;
                break;
            case "C":
                harga_total = 1000000;
                break;
           
        }
        kembali =bayar-harga_total;
        //output dan hasil
        System.out.println();
        System.out.println("Tampilan");
        System.out.println("Nama            : "+nama);
        System.out.println("Alamat          : "+alamat);
        System.out.println("kembali         : "+kembali);
    }
    
}
