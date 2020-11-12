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
public class Kubus {
    private int sisi, massa;
    
    public int getSisi() {
        return sisi;
    }
    
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    public int getMassa(){
        return massa;
    }
    
    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        return parSisi = sisi * sisi * sisi;
    }
    
    public int hitungMassaJenis (int parMassa, int volume) {
        volume = hitungVolume(sisi);
        return parMassa = massa / volume;
    }
    
    
    
}
