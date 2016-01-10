import java.math.BigInteger;
public class Node
{   
    public Node (BigInteger data){
        this.data=data;
        this.berikut=null;
    }
    
    public BigInteger data;
    public Node berikut;
}