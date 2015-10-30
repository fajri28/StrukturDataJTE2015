import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class UjiTransaksi {
    public UjiTransaksi() { }

    @Before
    public void setUp() { 
        this.kapan = new Date();
    }

    @After
    public void tearDown() { }
    
    @Test
    public void consructorDefault() {
        transaksi = new Transaksi();
        assertNotNull(transaksi);
        assertEquals(transaksi.debit().longValue(), 0l);
        assertEquals(transaksi.kredit().longValue(), 0l);
    }
    
    @Test
    public void consructor() {
        transaksi = new Transaksi(kapan, debit, kredit);
        assertNotNull(transaksi);
        assertEquals(transaksi.kapan().toString(), kapan.toString());
        assertEquals(transaksi.debit().longValue(), debit);
        assertEquals(transaksi.kredit().longValue(), kredit);
    }
    
    @Test
    public void kapan() {
        transaksi = new Transaksi(kapan, debit, kredit);
        assertNotNull(transaksi);
        assertEquals(transaksi.kapan().toString(), kapan.toString());
    }
    
    @Test
    public void debit() {
        transaksi = new Transaksi(kapan, debit, kredit);
        assertNotNull(transaksi);
        assertEquals(transaksi.debit().longValue(), debit);
    }
    
    @Test
    public void kredit() {
        transaksi = new Transaksi(kapan, debit, kredit);
        assertNotNull(transaksi);
        assertEquals(transaksi.kredit().longValue(), kredit);
    }
    
    private long debit = 123;
    private long kredit = 456;
    private Date kapan;
    private Transaksi transaksi;
}
