
/**
 * Write a description of class Becak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Becak implements Kendaraan
{
   private String plat;
    /**
     * Constructor for objects of class Becak
     */
    public Becak(String plat)
    {
        this.plat=plat;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String plat()
    {
        return plat;
    }
    public String tipe()
    {
        return "Becak";
    }
}
