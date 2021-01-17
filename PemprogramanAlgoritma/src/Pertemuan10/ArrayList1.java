
package Pertemuan10;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
       ArrayList arrayData = new ArrayList();
       arrayData.add ("Batik");
       arrayData.add (2180);
       arrayData.add("Stadion");
       arrayData.add (2.8);
       arrayData.add(true);
       System.out.println(arrayData);
       System.out.println("Data Array berisi "+arrayData.size()+" item");
       arrayData.remove("Batik");
       arrayData.add("Megono");
       System.out.println(arrayData);
       System.out.println("Data Array berisi "+arrayData.size()+" item");
    }
    
}
