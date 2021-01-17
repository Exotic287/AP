
package Pertemuan05;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int pilihan = 0;
        do {
            System.out.println(" Pilihlah Menu Berikut Ini :");
            System.out.println("1.Cetak ");
            System.out.println("2.Tampilkan ");
            System.out.println("3.Keluar ");
            System.out.print("Pilihan Anda : ");
            pilihan = inputan.nextInt();
            if(pilihan == 1){
                System.out.println("Cetak Laporan,Siapkan Printer \n");
            }else if (pilihan == 2){
                System.out.println("Tampilkan Laporan \n");
            }else{
                
            }
        }while(pilihan != 3);
    }
    
}
