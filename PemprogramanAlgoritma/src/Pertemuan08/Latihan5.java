
package Pertemuan08;

import javax.swing.JOptionPane;

public class Latihan5 {
    public static void main(String[] args) {
        int pilihan = JOptionPane.showOptionDialog(null, 
        "Ingin Keluar?",
        "Keluar",
        JOptionPane.YES_OPTION,
        JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if (pilihan == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Program Akan Keluar");
            System.exit(0);
        }
    }
    
}
