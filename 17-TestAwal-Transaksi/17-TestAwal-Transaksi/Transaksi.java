
/**
 * Write a description of class Transaksi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date;
import java.math.BigInteger;

public class Transaksi {
    
    private Date kapan;
    private BigInteger debit;
    private BigInteger kredit;
    private BigInteger saldo;
    
    public Transaksi() {
        this.kapan = new Date();
        this.debit = new BigInteger("0");
        this.kredit = new BigInteger("0");
         
    }
    
     public Transaksi(Date kapan, long debit, long kredit) {
        this.kapan = kapan;
        this.debit = new BigInteger (Long.toString (debit));
        this.kredit = new BigInteger (Long.toString (kredit));
    }
    
    public Transaksi(Date kapan, BigInteger debit, BigInteger kredit) {
        this.kapan = kapan;
        this.debit = debit;
        this.kredit = kredit;
    }
    
    public Transaksi(Date kapan, String debit, String kredit) {
        this.kapan = kapan;
        this.debit = new BigInteger (debit);
        this.kredit = new BigInteger (kredit);
    }
    
    
    public Date kapan() {
        return kapan;
    }
    
    public BigInteger debit() {
        return debit;
    }
    public String debitStr(){
        return debit.toString();
    }
    
    public BigInteger kredit() {
        return kredit;
    }
    public String kreditStr(){
        return kredit.toString();
    }
    public BigInteger saldo(BigInteger saldoAwal){
        saldo = saldoAwal.add(debit).subtract(kredit);
        return saldo;
        
    }
    public String saldoStr(BigInteger saldoAwal){
        return saldo.toString();
    }

}