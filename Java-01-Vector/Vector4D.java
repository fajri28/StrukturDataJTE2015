
/**
 * Write a description of class Vector4D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date;

public class Vector4D extends Vector3D
{
    private Date t;
    //private Date t = new Date();
    //private double x, y, z;
    public Vector4D(double x, double y, double z, Date t)
    {
        super (x,y,z);
        //this.x= x;---
        //this.y= y;
        //this.z= z;---
        this.t= t;
    }
    public Date getT(){
    return t;
    }
}
