//import de.uni_hannover.hci.AmjadTrablsi.aufgabe1



package data.DiscMedia.type;
import data.DiscMedia.DiscMedia;



/**
 *cd Classs
 */
public class CD extends DiscMedia{
    
    private String sta_price = "8.99";
    
    
    
    /**
     *konstractor
     */
    public CD(String title_ , String price_,String asin_){
        //double d = 0;
       
            

        
          super(title_,price_,asin_);
        
    }
    
    /**
     * SeTTER PR_ICE
     *
     */
    public void setP(String s){
        
        this.sta_price = s ;
        
        
        
    }
    
    /**
     *Getter Price
     */
    public String getP(){
        
        
        return sta_price;
    }
    
     /**
      *ToSTRing METod 
      */
    public String toStr(){
           
           String s = String.format (" Title  : %s \n the price  %s Euro \n the MEdiaDisc ASIN : %s",super.title ,this.sta_price,this.asin);
           return s ;
          
           
       }

}
