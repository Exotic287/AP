
package Pertemuan03;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        double nilaiPresensi, nilaiTugas, nilaiKeaktifan, nilaiUTS, 
            nilaiUAS, nilaiAkhir;
        String grade;
        
        Scanner inputan = new Scanner(System.in);
        System.out.print("Nilai Presensi : ");
        nilaiPresensi = inputan.nextDouble();
        System.out.print("Nilai Tugas : ");
        nilaiTugas = inputan.nextDouble();
        System.out.print("Nilai Keaktifan : ");
        nilaiKeaktifan = inputan.nextDouble();
        System.out.print("Nilai UTS : ");
        nilaiUTS = inputan.nextDouble();
        System.out.print("Nilai UAS : ");
        nilaiUAS = inputan.nextDouble();
        
        
        nilaiAkhir = (nilaiPresensi+nilaiTugas+nilaiKeaktifan+nilaiUTS+nilaiUAS)/5;
        
        if (nilaiAkhir>=80){
            grade="A";
        }else if (nilaiAkhir>=70){
            grade= "B";
        }else if (nilaiAkhir>=60){
            grade="C";
        }else if(nilaiAkhir>=50){
            grade="D";
        }else{
            grade="E";
        }
        System.out.println("NilaiAkhir :"+nilaiAkhir);
        System.out.println("Grade : "+grade);
    }
    
}
