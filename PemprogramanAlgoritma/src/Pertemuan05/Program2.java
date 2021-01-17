
package Pertemuan05;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int hitung =0,id=0;
        while(id != 2180){
            System.out.print("Masukan Kode Akses : ");
            id=inputan.nextInt();
            if (id == 2180){
                System.out.println("Selamat Anda Berhasil Masuk");
            }else{
                System.out.println("Kode Akses Anda Salah!!!");
            }
            
        }
        
    }
    
}
