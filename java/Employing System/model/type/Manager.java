

package model.type;

import model.Employee;


public class Manager extends Employee{
    /**
     *  variablen
     *      private to save the orginal class from change
     */
    
    private String range ;
    
    
    private double gehalt ;
    
    private int projekts_zahl;
    
    private final double  por_zent= 0.1;    //the value never change
    
    
    private double urlaub ;
    
    
    
    /**
     
     konstructor
     */
    
    public Manager(String vorname , String nachname, String range_){
        
        super(vorname,nachname);
        
        this.range = range_;
        this.projekts_zahl = 0;
        this.setG();
        this.setU();
        
        
    }
    /**
     setter for gehalt
     */
    public void setG(){
        if(this.range.equals("Project Manager")){
            this.gehalt = 8000;
            this.gehalt += projekts_zahl * por_zent * this.gehalt;
            
        }else this.gehalt = 10000;
        
        
    }
    
    /**
     getter for gehalt
     */
    public double getG(){
        
        return this.gehalt;
    }
    
    /**
     *setter  "urlaub"
     */
    public void setU(){
        
        this.urlaub = 20;
    }
    /**
     getter urlaub
     */
    public double getU(){
        
        return this.urlaub ;
    }
    
    
    public String getR(){
        
        return this.range;
        
        
    }
    
    /**
     * to String MEthod
     */
    
    public String toStr(){
        
        String s = String.format("vorname : %s   ,Nachname;  %s ( %s)  ,Gehalt :  %.2f Euro, Urlaubtage :  %.2f day . ", super.vorname , super.nachname,this.range, this.gehalt,this.urlaub);
        
        return s ;
        
        
    }
    
    
    
}



