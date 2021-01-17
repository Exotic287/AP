
package Pertemuan03;

public class Program4 {
    public static void main(String[] args) {
        String lampu;
        lampu = "merah";
        System.out.println("Lampu = "+lampu);
        switch(lampu){
            case "merah":
                System.out.println("Berhenti");
                break;
            case "kuning":
                System.out.println("Siap-Siap");
                break;
            case "hijau":
                System.out.println("Jalan");
                break;
            default:
                System.out.println("Lampu Error");
        }
    }
    
}
