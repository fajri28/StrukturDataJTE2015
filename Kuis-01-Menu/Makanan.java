
/**
 * Write a description of class Makanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Makanan
{
    private String nama;
    private int harga;
    private JenisMakanan [] jenisMakanan;
    
    public Makanan(String nama){
        this.nama = nama;
    }
    public int getHarga(){
        return harga;
    }
    public int setHarga(int harga) {
        this.harga=harga;
        return harga;
    }
    public JenisMakanan [] daftarJenisMakanan(){
        return jenisMakanan;
    }
}
