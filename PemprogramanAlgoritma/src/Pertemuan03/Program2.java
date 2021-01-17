package Pertemuan03;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
                int nilai;
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukan Nilai : ");
        nilai = inputan.nextInt();
        
        //logika IF/ELSE
        if(nilai>=70){
            System.out.println("Selamat Anda LULUS!!!");
        }else{
            System.out.println("Maaf Anda Belum LULUS");
        }
        System.out.println("Tetap Semangat!!!");
    }
    
}
