
package Pertemuan09;

import java.util.Scanner;

public class Program1 {
        public static void main(String[] args) {
             // Membuat Scanner
        Scanner inputan = new Scanner(System.in);
        // Menampilkan Banyaknya Kata-Kata
        System.out.print("Masukan Jumlah Kata : ");
        int n = inputan.nextInt();
        // Membuat Array Kata-Kata dengan Inputan User
        String kata []=new String[n];
        // Membuat inputan Kata
        for (int i=0;i<kata.length;i++){
            System.out.print("Kata ke "+(i+1)+" : ");
            kata [i]=inputan.next();
        }
        // Menampilkan Semua Hasil Inputan yang menggunakan Array
        System.out.println("Kata-Kata yang dimasukan");
        for (int i = 0; i<kata.length;i++){
            System.out.println((i+1)+". "+kata[i]);
        }
        
    }
    
}
