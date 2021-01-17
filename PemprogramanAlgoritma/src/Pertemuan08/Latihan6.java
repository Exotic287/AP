
package Pertemuan08;

import javax.swing.JOptionPane;

public class Latihan6 {
    public static void main(String[] args) {
        String a,b;
        int nilaiA;
        int nilaiB;
        a = JOptionPane.showInputDialog("Masukan Nilai A ");
        b = JOptionPane.showInputDialog("Masukan Nilai B ");
        
        nilaiA = Integer.valueOf(a);
        nilaiB = Integer.valueOf(b);
        
        int tambah = nilaiA + nilaiB;
        int kurang = nilaiA - nilaiB;
        int kali = nilaiA * nilaiB;
        int bagi = nilaiA / nilaiB;
        
        JOptionPane.showMessageDialog(null, "Pertambahan \n" +nilaiA+" + "+nilaiB+" = "+tambah);
        JOptionPane.showMessageDialog(null, "Pengurangan \n" +nilaiA+" - "+nilaiB+" = "+kurang);
        JOptionPane.showMessageDialog(null, "Perkalian \n" +nilaiA+" x "+nilaiB+" = "+kali);
        JOptionPane.showMessageDialog(null, "Pembagian \n" +nilaiA+" / "+nilaiB+" = "+bagi);
    }
    
}
