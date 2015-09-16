/**
 * Class untuk matriks 2x2
 * dibantu oleh Ryan Irfandi
 */
public class Matriks2x2 {
    /**
     * Constructor dengan nilai awal
     */
    public Matriks2x2(int a11, int a12, int a21, int a22) {
        this.a11 = a11;
        this.a12 = a12;
        this.a21 = a21;
        this.a22 = a22;
    }
    
    /**
     * Getter untuk elemen tertentu
     * 
     * @throws SalahIndeks Jika indeks diluar batas (>2 atau <1)
     */
    public int elemen(int baris, int kolom) throws SalahIndeks {
        if (baris == 1) {
            if (kolom == 1)
                return a11;
            else if (kolom == 2)
                return a12;
            throw new SalahIndeks("Indeks kolom >2!");
        }
        else if (baris == 2) {
            if (kolom == 1)
                return a21;
            else if (kolom == 2)
                return a22;
            throw new SalahIndeks("Indeks kolom >2!");
        }
        throw new SalahIndeks("Indeks bari >2!");
    }
    
    /**
     * Menjumlahkan dua Matriks
     */
    Matriks2x2 tambah(Matriks2x2 kanan) {
        int a11 = 0, a12 = 0, a21 = 0, a22 = 0;
        
        try {
            a11 = this.a11 + kanan.elemen(1,1);
            a12 = this.a12 + kanan.elemen(1,2);
            a21 = this.a21 + kanan.elemen(2,1);
            a22 = this.a22 + kanan.elemen(2,2);
        }
        catch(SalahIndeks err) { }

        return new Matriks2x2(a11, a12, a21, a22);
    }
    
    /**
     * Mengurangkan dua Matriks
     */
    Matriks2x2 kurang(Matriks2x2 kanan) {
        int a11 = 0, a12 = 0, a21 = 0, a22 = 0;
        
        try {
            a11 = this.a11 - kanan.elemen(1,1);
            a12 = this.a12 - kanan.elemen(1,2);
            a21 = this.a21 - kanan.elemen(2,1);
            a22 = this.a22 - kanan.elemen(2,2);
        }
        catch(SalahIndeks err) { }

        return new Matriks2x2(a11, a12, a21, a22);
    }
    
    /**
     * Mengalikan dua Matriks
     */
    Matriks2x2 kali(Matriks2x2 kanan) {
        int a11 = 0, a12 = 0, a21 = 0, a22 = 0;
        
        try {
            a11 = this.a11 * kanan.elemen(1,1) + this.a12 * kanan.elemen(2,1);
            a12 = this.a11 * kanan.elemen(1,2) + this.a12 * kanan.elemen(2,2);
            a21 = this.a21 * kanan.elemen(1,1) + this.a22 * kanan.elemen(2,1);
            a22 = this.a21 * kanan.elemen(1,2) + this.a22 * kanan.elemen(2,2);;
        }
        catch(SalahIndeks err) { }

        return new Matriks2x2(a11, a12, a21, a22);
    }
    double determinan(){
         int a11 = 0;
         int a12 = 0;
         int a21 = 0;
         int a22 = 0;
   
         double determinan = (this.a11 * this.a22) - (this.a12 * this.a21);
    
         return determinan;
    }
    
    Matriks2x2 inverse() throws TanpaInverse, SalahIndeks {

        Matriks2x2 A = new Matriks2x2(a11, a12, a21, a22);
        double detA = A.determinan();

            try{
            if (detA != 0){
                throw new TanpaInverse("error");
            }
         
               else {
                    double a11 = this.a22/(int) detA;
                    double a12 = -this.a12/(int) detA; 
                    double a21 = -this.a21/(int) detA;
                    double a22 = this.a11/(int) detA;
                }
            }catch(TanpaInverse e){ }
    
        return new Matriks2x2(a11, a12, a21, a22);
    }
   
    private int a11, a12, a21, a22;
    }