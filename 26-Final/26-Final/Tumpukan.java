import java.math.BigInteger;

public class Tumpukan
{
    private Node atas;
    private Node bawah;
    
    public Tumpukan()
    {
        atas=null;
        bawah=null;
    }

    
    public void tumpuk(BigInteger data){
    Node baru = new Node(data);
    baru.berikut = null;
    
    if(atas==null){
        bawah = baru;
        atas = baru;
    }
    else{
        atas.berikut = baru;
        atas = baru;
    }
        }
    
    public BigInteger ambil(){
    return null;
    }   
    public BigInteger atas()
    {
        if(atas==null)
        return null;
        else {
            return atas.data;
        }
    }
    
    public BigInteger bawah()
    {
        if(bawah!=null)
        return bawah.data;
        else{
            return null;
        }
    }
}

