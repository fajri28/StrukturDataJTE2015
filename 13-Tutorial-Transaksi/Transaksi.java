import java.util.Date;

public class Transaksi {
    public Transaksi() {
        this.kapan = new Date();
        this.debit = new Long(0l);
        this.kredit = new Long(0l);
    }
    
    public Transaksi(Date kapan, Long debit, Long kredit) {
        this.kapan = kapan;
        this.debit = debit;
        this.kredit = kredit;
    }
    
    public Date kapan() {
        return kapan;
    }
    
    public Long debit() {
        return debit;
    }
    
    public Long kredit() {
        return kredit;
    }
    
    private Date kapan;
    private Long debit;
    private Long kredit;
}