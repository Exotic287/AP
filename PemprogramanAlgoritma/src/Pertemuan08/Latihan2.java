
package Pertemuan08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan2 {
    public static void main(String[] args) throws IOException {
        String nama;
        // membuat objek inputstream
        InputStreamReader inputan = new InputStreamReader(System.in);
        // membuat objek bufferreader
        BufferedReader masukan = new BufferedReader(inputan);
        // mengisi variabel nama bufferreader
        System.out.print("Nama : ");
        nama = masukan.readLine();
        //tampilkan Buferreader
        System.out.println("Nama Kamu Adalah "+nama);
    }
    
}
