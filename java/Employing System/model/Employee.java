package model;

/**
 
 
 
 this it the abstruckt class  Empoloye , he had  all the property of Employees
 */

public abstract class Employee{
    
   protected String vorname ;
  protected  String nachname;
    
    
    
    //contractor
    public Employee(){
        
        
    }
    
    /**
     konstractor
     */
    public Employee(String vorname_ ,String nachname_ ){
        
        this.vorname = vorname_;
        this.nachname = nachname_;
        
    }
    //getter surename
    public String getN(){
         
         return this.vorname ;
     }
     //Gitter nachname
     public String getNN(){
          
          return this.nachname ;
      }

    public abstract void setG();
    
    
    public abstract double getG();
        
       
    
    public abstract void setU();
        
       
    public abstract double  getU();
    
    public abstract String getR();
    
    
    abstract public String toStr();
     
   
    
    
}
