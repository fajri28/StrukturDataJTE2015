
/**
 * Write a description of class Obat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obat
{
   public Pasien [] pasien;
   public String tulisan;
   public int banyaknya;
   
    public Obat(Pasien[] pasien){
       this.pasien=pasien;
    }
    public String getTulisan(){
        return tulisan;
    }
    public int getBayaknya(){
        return banyaknya;
    }
}
