
package mahasiswa;

import java.util.ArrayList;

public class ContohArrayList {
    
    public static void main(String[] args){
        
        ArrayList<String> nama = new ArrayList<>();
        
        nama.add("Selpia");
        nama.add("Meilani");
        nama.add("selpi");
        
        System.out.println("Isi ArrayList: " + nama);
        
        nama.remove("selpi");
        
          boolean adaMeilani = nama.contains("Meilani");

        System.out.println("Apakah ada Meilani? " + adaMeilani);

        
        System.out.println("Isi ArrayList setelah dihapus: " + nama);
    }
    
}
