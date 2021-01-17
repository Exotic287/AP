
package Pertemuan09;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        // Membuat Inputan Scanner
        Scanner inputan = new Scanner(System.in);
        // Memasukan Banyaknya Data Ke Array
        System.out.print("Masukan Jumlah Mahasiswa : ");
        int n = inputan.nextInt();
        // Membuat Array
        String nama[]=new String[n];
        String status[]=new String[n];
        int nilai[]= new int[n];
        
        // Mengisi Data Array
        for (int i=0;i<n;i++){
            System.out.println("Mahasiswa Ke : "+(i+1));
            
            System.out.print("Nama   : ");
            nama [i]=inputan.next();
            
            System.out.print("Nilai  : ");
            nilai [i]=inputan.nextInt();
            
            if (nilai[i] <= 50 ){
                status[i]="Tidak Lulus";
            }else{
                status[i]="Lulus";
            }
        }
        // Menampilkan Semua Data Array
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("----------------------");
        System.out.println("NO     Nama    Nilai       Status  ");
        for (int i=0;i<n;i++){
            System.out.println((i+1)+"      "+nama[i]+"     "+nilai[i]+"        "+status[i]);
        }
    }
    
}
