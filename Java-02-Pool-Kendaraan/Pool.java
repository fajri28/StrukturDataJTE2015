
/**
 * Write a description of class Pool here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pool
{
    private Kendaraan [] kendaraan;
    public Pool(Kendaraan [] kendaraan)
    {
       this.kendaraan=kendaraan;
         if (this.kendaraan == null)
        this.kendaraan = new Kendaraan[0];
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int jumlah()
    {
        return kendaraan.length;
    }
    
    public Kendaraan [] daftarKendaraan()
    {
        return kendaraan;
    }
}
