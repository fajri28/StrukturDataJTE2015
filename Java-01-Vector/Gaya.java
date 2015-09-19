
/**
 * Write a description of class Gaya here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gaya
{
    //asosiasi ke class Vector3D
    //          |
    private Vector3D titikAcuan;
    private Vector3D arah; 
    
    public Gaya(Vector3D titikAcuan, Vector3D arah)
    {
        this.arah=arah;
        this.titikAcuan=titikAcuan;
    }
    public  Vector3D getTitikAcuan(){   
    return titikAcuan;
    }
    public Vector3D getArah(){
    return arah;
    }    
}
