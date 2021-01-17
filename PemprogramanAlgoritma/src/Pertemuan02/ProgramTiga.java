
package Pertemuan02;

import java.util.Scanner;

public class ProgramTiga {
    public static void main(String[] args) {
                //deklarasi variable
        double luasSegitiga;
        int alas, tinggi;
        
        //membuat inputan dengan scanner
        Scanner inputan = new Scanner(System.in);
        
        //input
        System.out.println("----Program Hitung Luas Segitiga----");
        System.out.print("Input Alas \t = ");
        alas = inputan.nextInt();
        System.out.print("Input tinggi \t = ");
        tinggi = inputan.nextInt();
        
        //proses
        luasSegitiga = Double.valueOf((alas*tinggi)/2);
        
        //output
        System.out.println("Luas \t \t = "+luasSegitiga);
    }
    
}
