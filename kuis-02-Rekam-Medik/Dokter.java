
/**
 * Write a description of class Dokter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dokter
{
   public Pasien [] pasien;
   public String nama;
   public String catatan;
   
   public Dokter (Pasien [] pasien){
       this.pasien=pasien;
    }
   public String getNama (){
       return nama;
    }
   public String getCatatan(){
       return catatan;
    }
   
   
}
