
package Pertemuan08;

import javax.swing.JOptionPane;

public class Program4 {
    public static void main(String[] args) {
                int pilihan = JOptionPane.showConfirmDialog(null,"Silahkan Konfirmasi?");
        switch(pilihan){
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Kamu memilih YES");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Kamu memilih No");
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(null, "Kamu Memilh CANCEL");
                break;
        }
    }
    
}
