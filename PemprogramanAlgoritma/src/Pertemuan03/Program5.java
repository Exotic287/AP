
package Pertemuan03;

public class Program5 {
    public static void main(String[] args) {
        int belanjaan, diskon, bayar;
        String kartu = "iya";
        belanjaan = 50000;
        System.out.println("apakah punya kartu member ? "+kartu);
        System.out.println("Total Belanja "+belanjaan);
        
        if(kartu.equalsIgnoreCase("iya")){
            if(belanjaan>=500000){
                diskon = 50000;
            }else if (belanjaan>=100000){
                diskon = 15000;
            }else{
                diskon = 0;
            }
        }else{
            if (belanjaan>=100000){
                diskon = 5000;
            }else{
                diskon = 0;
            }
        }
        bayar = belanjaan - diskon;
        System.out.println("Total Bayar Rp. "+bayar);
    }
    
}
