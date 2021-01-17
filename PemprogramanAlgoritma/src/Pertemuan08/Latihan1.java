
package Pertemuan08;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        //deklarasi variabel
        String nama,alamat;
        int usia;
        //membuat Scanner baru
        Scanner masukan = new Scanner(System.in);
        //Tampilan output Ke user
        System.out.println("## Data Diri ##");
        System.out.print("Nama      : ");
        //menggunakan Scanner dan menyimpan apa yang diketik divariabel nama
        nama = masukan.nextLine();
        System.out.print("Alamat    : ");
        alamat = masukan.nextLine();
        System.out.print("Usia      : ");
        usia = masukan.nextInt();
        
        // menampilkan apa yang sudah disimpan di varabel
        System.out.println("-----------------------------------");
        System.out.println("Nama Karyawan   : "+nama);
        System.out.println("Alamat          : "+alamat);
        System.out.println("Usia            : " +usia+ " Tahun");
    }
    
}
