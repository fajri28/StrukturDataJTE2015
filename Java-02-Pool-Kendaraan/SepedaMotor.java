
/**
 * Write a description of class SepedaMotor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SepedaMotor implements Kendaraan
{
    private String plat;
    public SepedaMotor(String plat)
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
        return "SepedaMotor";
    }
}
