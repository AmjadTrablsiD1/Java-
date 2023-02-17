package model;   // Aufgabe A

public class Fraction{
    
    private int zahler ;
    private int nenner ;
    
    // Aufgabe A
    public String str(){
        String s = "";
        String s1 = String.format(" %d / %d", zahler, nenner);
        //System.out.println(s1);
        return s1;
        
    }
  
    
    public  Fraction(int z , int n){
        this.zahler = z ;
        if( n != 0) this.nenner = n ;
        
        this.reduce();
    }
    
   
        //seter & getter  Aufgabe b
    
    public void setZ(int zal){
        this.zahler = zal ;
        this.reduce();
        
        
    }
    public void setN(int nen){
       if( nen != 0)  this.nenner  = nen ;
        this.reduce();
        
        
    }
    
    public int  getZ(){     //setNumerator getDenominator
        return this.zahler ;
        
    }
    
    public int  getN(){         //get Numerator getDenominator
        return this.nenner ;
        
    }
    
    
    public void setValues(int z, int n ){
        
        
        
        this.zahler = z;
        if( n != 0) this.nenner = n;
        this.reduce();
        
    }
    
      
    
    //Aufgabe b
    
    
    // Help Method for reduce ;
    public static int ggt(int a, int b) {
       
        int h = (a > b) ? b : a;
        // Der GGT wird hier berechnet.
        for (int i = h; i > 1; i--) {
            if ((a % i) == 0 && (b % i) == 0) {
                return i;
            }
        }
    
        return 1;
    }

    private void reduce(){
        
        int ggt_number = ggt(this.zahler,this.nenner);
        
        this. zahler = this.zahler / ggt_number;
        this.nenner = this.nenner / ggt_number ;
        
        
    }
    
    //Aufgabe c
      
     private void extend( int amount){
                this.zahler *=  amount;
                this.nenner *= amount;
         
         
         
     }
    
    //Aufgabe C
    
    public Fraction add(Fraction summand){
        /*
        int gcdn = gcd(this.nenner ,summand.getN());
        
        this.extend(gcdn);
        summand.extend(gcdn);
        */
        
        int sum_nenner = summand.getN();
        int this_nenner = this.nenner ;
        
        this.extend(sum_nenner);
        summand.extend(this_nenner);
        
        int nz = summand.getZ() + this.zahler ;
        int nn = this.nenner ;
        
        
        
        Fraction ergebnis = new Fraction(nz,nn);
        
        
        
        
        return ergebnis;
        
        
        
    }
    
    
    
    
    //aufgabe d
    
    
    public Fraction multiply(Fraction multiplicand){
        
        int newzahler = this.zahler * multiplicand.getZ();
        int newnenner = this.nenner * multiplicand.getN();
        
        Fraction newF = new Fraction(newzahler ,newnenner);
       
        return newF ;
    }
    
    
    
    
    
    
    
    
}
