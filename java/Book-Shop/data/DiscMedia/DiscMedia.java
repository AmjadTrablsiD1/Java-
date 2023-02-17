//import de.uni_hannover.hci.AmjadTrablsi.aufgabe1



package data.DiscMedia;
import data.item;
/**
 *Disc MEdia Class bsiis class for cd dvd and blue Ray
 */
public class DiscMedia extends item{
    
    protected String asin = "empty" ;
    
    /**
     *konstroctor
     *@param title , price , ASIN CODE
     *
     */
    public DiscMedia(String title_, String price_,String asin_){
        
        super(title_,price_);
        this.asin = asin_;
        
    }
    /**
     *Setter for ASIN
     */
    public void setAsin(String s ){
        
        this.asin = s;
        
        
    }
    /**
     * GETTER for ASIN
     */
   
    
    public String getAsin(){
        return this.asin ;
    }
    
    /**
     
     To STring MEthod 
     */
    
    public String toStr(){
        
        String s = String.format ("\n Title  : %s \n the price  %s  euro \n the MEdiaDisc ASIN : %S",super.title ,super.price,this.asin);
        return s ;
       
        
    }
    
}
