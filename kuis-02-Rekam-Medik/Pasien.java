
/**
 * Write a description of class Pasien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pasien
{
   public Pemeriksaan [] pemeriksaan;
   public String nama;
   
   public Pasien (Pemeriksaan [] pemeriksaan){
       this.pemeriksaan=pemeriksaan;
    }
   public String getNama (){
       return nama;
    }
}
