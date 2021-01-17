
package Pertemuan04;

import java.util.Scanner;

public class KuisPercabanganBersarang {
    public static void main(String[] args) {
        // masukan variabel
    int id, jumlahAnak, tunjangan, status, jabatan ;
    String namaKaryawan=null;
    double tk=0, ta=0, totalGaji=0, pph=0, gajiBersih=0;
    
    //membuat inputan
    Scanner inputan = new Scanner(System.in);
    System.out.println("---------------------------------------------------");
    System.out.println("\t \t APLIKASI PENGGAJIAN \t \t ");
    System.out.println("---------------------------------------------------");    
    System.out.print("ID Karyawan \t \t : ");
    id = inputan.nextInt();
    System.out.print("Nama Karyawan \t \t : ");
    namaKaryawan = inputan.next();
    
    System.out.print("Jabatan [1/2/3/4] \t : ");
    jabatan = inputan.nextInt();
    System.out.print("Status [1/2] \t \t : ");
    status = inputan.nextInt();
    System.out.print("Jumlah Anak [1/2/3] \t : ");
    jumlahAnak = inputan.nextInt();
    System.out.println("---------------------------------------------------");
    //percabangan menggunakan switch case
    switch (jabatan){
         case 1 :
            System.out.println("Jabatan \t \t : Manager");
            System.out.println("Gaji Pokok \t \t : Rp 5.000.000");
            System.out.println("Tunjangan Jabatan \t : Rp 1.500.000");
            break;
        case 2 :
            System.out.println("Jabatan \t \t : Staf");;
            System.out.println("Gaji Pokok \t \t : Rp 3.000.000");
            System.out.println("Tunjangan Jabatan \t : Rp 700.000");
            break;
        case 3 :
            System.out.println("Jabatan \t \t : Pemasaran");
            System.out.println("Gaji Pokok \t \t : Rp 2.500.000");
            System.out.println("Tunjangan Jabatan \t : Rp 1.000.000");
            break;
        case 4 :
            System.out.println("Jabatan \t \t : Umum");
            System.out.println("Gaji Pokok \t \t : Rp 2.000.000");
            System.out.println("Tunjangan Jabatan \t : Rp 500.000");
            break;
        default :
            System.out.print("Jabatan Error \n"); 
            System.out.println("Gaji Pokok Error \n");
            System.out.println("Tunjangan Jabatan Error \n");
    }
    
    // percabangan menggunakan if else
    if (status == 1){        
        if(jabatan == 1 ){
            tk = Double.valueOf(0.1 * 5000000);
            if (jumlahAnak == 1){
                ta = Double.valueOf(0.05*5000000);
            }else if (jumlahAnak == 2){
                ta = Double.valueOf(0.1*5000000);
            }else if (jumlahAnak == 3){
                ta = Double.valueOf(0.15*5000000);
            }else {
                System.out.println("Tunjangan Anak Error \n");
            } 
        }else if(jabatan == 2) {
            tk = Double.valueOf(0.1*3000000);
            if (jumlahAnak == 1){
                ta = Double.valueOf(0.05*3000000);
            }else if (jumlahAnak == 2){
                ta = Double.valueOf(0.1*3000000);
            }else if (jumlahAnak == 3){
                ta = Double.valueOf(0.15*3000000);
            }else {
                System.out.println("Tunjangan Anak Error \n");
            } 
        }else if(jabatan==3){
            tk = Double.valueOf(0.1*2500000);
            if (jumlahAnak == 1){
                ta = Double.valueOf(0.05*2500000);
            }else if (jumlahAnak == 2){
                ta = Double.valueOf(0.1*2500000);
            }else if (jumlahAnak == 3){
                ta = Double.valueOf(0.15*2500000);
            }else {
                System.out.println("Tunjangan Anak Error \n");
            } 
        }else if(jabatan == 4){
            tk = Double.valueOf(0.1*2000000);
            if (jumlahAnak == 1){
                ta = Double.valueOf(0.05*2000000);
            }else if (jumlahAnak == 2){
                ta = Double.valueOf(0.1*2000000);
            }else if (jumlahAnak == 3){
                ta = Double.valueOf(0.15*2000000);
            }else {
                System.out.println("Tunjangan Anak Error \n");
            } 
        }else {
            tk = 0;
            ta = 0;
        }       
        System.out.println("Tunjangan Keluarga \t : Rp "+tk);
        System.out.println("Tunjangan Anak \t \t : Rp "+ta);
        /*tunjangan anak dimasukan ke if else tunjangan keluarga karena kalau
        *dibuatin if else sendiri otomatis kalau statusnya milih lajang terus ngisi
        *jumlah anak pasti tunjangan anak ikut kehitung,walaupun milihnya statusnya lajang
        *secara logika, apakah seseorang lajang sudah punya anak ?
        *jadi ketika milihnya lajang otomatis dia tidak punya potongan tunjangan keluarga dan anak
        */  
    }else if(status==2){        
        System.out.println("Tunjangan Keluarga \t : Rp 0-, ");
        System.out.println("Tunjang Anak \t \t : Rp 0-, ");
    }else{
        System.out.println("Tunjangan Keluarga Error \n");

    
    }
    
    
    //menghitung total gaji kotor
    if(jabatan==1){
        totalGaji=5000000+1500000+tk+ta;
    }else if(jabatan==2){
        totalGaji=3000000+700000+tk+ta;
    }else if(jabatan==3){
        totalGaji=2500000+1000000+tk+ta;
    }else if(jabatan==4){
        totalGaji=2000000+500000+tk+ta;
    }else{
        totalGaji=0;
    }
    System.out.println("---------------------------------------------------");
    System.out.println("Total Gaji \t \t : Rp "+totalGaji);
    
    //menghitung ppn
    pph = 0.025*totalGaji;
        System.out.println("Potongan PPh 2,5% \t : Rp "+pph);
        System.out.println("---------------------------------------------------");
    // menghitung total Gaji Bersih
    gajiBersih = totalGaji-pph;   
        System.out.println("Gaji Bersih \t \t : Rp "+gajiBersih);
        System.out.println("---------------------------------------------------");
    }
    
}
