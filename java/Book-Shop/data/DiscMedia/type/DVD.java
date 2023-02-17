//import de.uni_hannover.hci.AmjadTrablsi.aufgabe1



package data.DiscMedia.type;
import data.DiscMedia.DiscMedia;
/**
 *DVD CLASS
 *
 *
 *
 */


public class DVD extends DiscMedia{
    /**
     
     *standard price
     private to save the  orginal class form  changes
     */
    private String sta_price = "9.99";

    /**
     *konstrktor
     *
     */
    public DVD(String title_ , String price_,String asin_){
        
        super(title_,price_,asin_);
        
    }
    /**
     
    /* Setter Price
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
 *to String Methode
 */
    
   public String toStr(){
           
           String s = String.format (" Title  : %s \n the price  %s Euro \n the MEdiaDisc ASIN : %S",super.title ,this.sta_price,this.asin);
           return s ;
          
           
       }
}
