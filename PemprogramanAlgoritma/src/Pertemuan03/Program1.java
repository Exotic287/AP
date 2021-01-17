package Pertemuan03;

import java.util.Scanner;


public class Program1 {
    public static void main(String[] args) {
        int totalBelanja;
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Total Belanja : ");
        totalBelanja = inputan.nextInt();
        
        //logika IF
        if(totalBelanja>50000){
            System.out.println("Anda Mendapatkan FREE ONGKIRR!!!");
        }
        System.out.println("Terima Kasih sudah belanja di toko kami");
    }
    
}
