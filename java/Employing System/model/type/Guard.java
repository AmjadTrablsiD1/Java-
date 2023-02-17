package model.type;

import model.Employee;
/**
 * Gurad class 
 */

public class Guard extends Employee{
    /**
     private to save the orginal class from chage
     */
    
    private  double urlaub ;
    private  String range ="guard" ;
    private double gehalt;
    
  
   private String schicht = "foüh" ;
    
    private int fs_counter;
   private int ss_counter ;
   private int ns_counter;
    
    
    
    
    /**
     *kostrctor
     */
    public Guard(String vorname,String name , int fs_,int ss ,int ns_){
        
        super(vorname,name);
        this.fs_counter = fs_;
        this.ss_counter = ss;
        this.ns_counter = ns_;
        this.setG();
        this.setU();
        
    }
    
    /**
     not usefull at all
     */
    public void setCounter(int fs , int ss , int ns){
        
        this.fs_counter = fs;
        this.ss_counter = ss ;
        this.ns_counter = ns;
        
        
    }
    /**
     setter GEhalt
     */
    public void setG(){
    
    
        this.gehalt =( (fs_counter  * 100)+( ss_counter  * 100)+( ns_counter  * 160));
    
        
        
       
    
    }
    
    /**
     *Setter Urlaub
     */
    public void setU(){
      
        this.urlaub = ( 20+ (fs_counter  * 0.25)+( ss_counter  * 0.25)+( ns_counter  * 0.5));
        
        
    }
    
    /**
     *getter Urlaub
     */
    public double getU(){
        
        return this.urlaub ;
    }
   
    
    
    
    /**
     getter Range
     */
    public  String getR(){
        
        return this.range;
        
        
        
    }

    
    
    /**
     getter Gehalt
     */
    
    public  double getG(){
    
    
        return this.gehalt;
        
    }
    
    
    /**
       getter norname
       */
    public String getN(){
        
        return super.vorname ;
    }
    
    
    /**
     getter nachname
     */
    
    public String getNN(){
         
         return super.nachname ;
     }

    /**
     * to String MEthod
     */
    
    public String toStr(){
        
        String s = String.format("vorname : %s   ,Nachname;  %s ( %s)  ,Gehalt :  %.2f Euro, Urlaubtage :  %.2f day . ", super.vorname , super.nachname,this.range, this.gehalt,this.urlaub);
        
        return s ;
        
        
    }
    
    
    
}
