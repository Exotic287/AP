
package Pertemuan10;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
         ArrayList <String> arrayData = new ArrayList();
         Scanner inputan = new Scanner(System.in);
         System.out.print("Jumlah Data = ");
         int banyakData=inputan.nextInt();
         for (int i=0 ; i < banyakData; i++){
             System.out.print("Data "+(i+1)+" = ");
             String isianData = inputan.next();
             arrayData.add(isianData);             
         }
         System.out.println("---------------------");
         for (String tampilRizal:arrayData){
             System.out.println(tampilRizal);
         }
         System.out.println("---------------------");
         System.out.print("Hapus Data = ");
         String hapusData=inputan.next();
         arrayData.remove(hapusData);
         System.out.println("---------------------");
         for (String tampilRizal:arrayData){
             System.out.println(tampilRizal);
         }  
    }
    
}
