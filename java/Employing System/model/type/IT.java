package model.type;

import model.Employee;

/**
 * IT Class
 */

public class IT extends Employee{
    /**
        *  variablen
        *      private to save the orginal class from change
        */
    
    
private int week_hours ;
private double gehalt;


private double urlaub ;
private  String range ;

    /**
    
    konstructor
    */
    
    
    
    public IT(String vorname,String name , String  range_, int w_s){
    
    super(vorname,name);
    this.range = range_;
    this.week_hours = w_s;

    
    this.setG();
    this.setU();
    
}




/**
 Setter GEhalt
 */

public void setG(){



double s_l = 0 ;

if(this.range.equals("Junior Developer"))s_l = 25 ;else s_l = 32;

double week_salary = week_hours * s_l ;
this.gehalt= ( week_salary *4.5);

    

}

/**
 *Getter Urlaup
 */

public void setU(){
  
this.urlaub=24;
    
    
}

/**
 *getter Urlaub
 */
    public double getU(){
        
        return this.urlaub ;
    }

public  String getR(){
       
       return this.range;
       
       
       
   }
    
    
public  double getG(){
   
   
    return this.gehalt;
       
   }

    public String getN(){
         
        return super.getN();
     }
     
     public String getNN(){
          
          return super.getNN() ;
      }
    /**
     * to String MEthod
     */
    

public String toStr(){
       
       String s = String.format("vorname : %s   ,Nachname;  %s ( %s)  ,Gehalt :  %.2f Euro, Urlaubtage :  %.2f day . ", super.vorname , super.nachname,this.range, this.gehalt,this.urlaub);
       
       return s ;
       
       
   }


}
