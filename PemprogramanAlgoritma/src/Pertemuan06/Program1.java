
package Pertemuan06;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int pilihMenu, angka1, angka2,hasil;
        String pilihanUlang;
        
        do{
            System.out.println("*****************************");
            System.out.println("PROGRAM ARITMATIKA");
            System.out.println("*****************************");
            System.out.println("1. Perkalian ");
            System.out.println("2. Pembagian ");
            System.out.println("3. Penjumlahan ");
            System.out.println("4. Pengurangan ");
            System.out.println("*****************************");
            System.out.print("Masukkan Pilihan Menu : ");
            pilihMenu = inputan.nextInt();
            
            switch (pilihMenu){
                case 1:
                    System.out.println("------------------------------------");
                    System.out.println("\t PROGRAM PERKALIAN");
                    System.out.println("------------------------------------");
                    System.out.print("Masukan Angka 1 : ");
                    angka1 = inputan.nextInt();
                    System.out.print("Masukan Angka 2 : ");
                    angka2 = inputan.nextInt();
                    hasil = angka1*angka2;
                    System.out.println(angka1+" x "+angka2+" = "+hasil);
                    System.out.println("------------------------------------");
                    break;
                case 2 :
                    System.out.println("------------------------------------");
                    System.out.println("\t PROGRAM PEMBAGIAN");
                    System.out.println("------------------------------------");
                    System.out.print("Masukan Angka 1 : ");
                    angka1 = inputan.nextInt();
                    System.out.print("Masukan Angka 2 : ");
                    angka2 = inputan.nextInt();
                    hasil = angka1/angka2;
                    System.out.println(angka1+" : "+angka2+" = "+hasil);
                    System.out.println("------------------------------------");
                    break;
                case 3 :
                    System.out.println("------------------------------------");
                    System.out.println("\t PROGRAM PENJUMLAHAN");
                    System.out.println("------------------------------------");
                    System.out.print("Masukan Angka 1 : ");
                    angka1 = inputan.nextInt();
                    System.out.print("Masukan Angka 2 : ");
                    angka2 = inputan.nextInt();
                    hasil = angka1+angka2;
                    System.out.println(angka1+" + "+angka2+" = "+hasil);
                    System.out.println("------------------------------------");
                    break;
                case 4 :
                    System.out.println("------------------------------------");
                    System.out.println("\t PROGRAM PENGURANGAN");
                    System.out.println("------------------------------------");
                    System.out.print("Masukan Angka 1 : ");
                    angka1 = inputan.nextInt();
                    System.out.print("Masukan Angka 2 : ");
                    angka2 = inputan.nextInt();
                    hasil = angka1-angka2;
                    System.out.println(angka1+" - "+angka2+" = "+hasil);
                    System.out.println("------------------------------------");
                    break;
                default :
                System.out.println("-----------------------------------");
                System.out.println("\t PROGRAM ERROR");
                System.out.println("-----------------------------------");
            }
            System.out.print("Apakah Akan Melakukan Perhitungan Lagi ? [y/t] : ");
            pilihanUlang = inputan.next();
            
        }while(pilihanUlang.equalsIgnoreCase("y"));
    }
    
}
