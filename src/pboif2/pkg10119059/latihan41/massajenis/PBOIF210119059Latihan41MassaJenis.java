/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Massa Jenis
 */
package pboif2.pkg10119059.latihan41.massajenis;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan41MassaJenis {

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        
        System.out.println("===== Massa Jenis Kubus =====");
        kubus.setSisi(5);
        System.out.println("Sisi : " +kubus.getSisi());
        kubus.setMassa(250);
        System.out.println("Sisi : " +kubus.getMassa());
        System.out.println("");
        
        System.out.println("===== Hasil Perhitungan =====");
        System.out.println("Volume : " +kubus.hitungVolume(0));
        System.out.println("Massa Jenis : " +kubus.hitungMassaJenis(0,0));
    }
    
}
