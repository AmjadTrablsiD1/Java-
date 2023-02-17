//import de.uni_hannover.hci.AmjadTrablsi.aufgabe1



package data.DiscMedia.type;
import data.DiscMedia.DiscMedia;
/**
 *blue ray class
 */


public class BlueRay extends DiscMedia{
    
    
    private String sta_price = "12.99";

    /**
     
     *konstractor
     */
    
    public BlueRay(String title_,String price_,String asin_){
        
        super(title_,price_,asin_);
        
    }
    
    /**
     *setter PRice
     */
    public void setP(String s){
        
        this.sta_price = s ;
        
        
    }
    
    /**
     *getter Price
     */
    public String getP(){
        
        
        return sta_price;
    }
    
    

    /**
     
     *to String method
     */
    public String toStr(){
        
        String s = String.format (" Title  : %s \n the price  %s Euro \n the MEdiaDisc ASIN : %S",super.title ,this.sta_price,this.asin);
        return s ;
       
        
    }
    
}
