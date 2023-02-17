
//import de.uni_hannover.hci.AmjadTrablsi.aufgabe1



package data.Book.type;
import data.Book.Book;

/**
 
 * HardBack Class
 */





public class Hardback extends Book{
    
    
    /**
     * private  to save the orginals class form change
     *
     * standrad price
     */
     private String sta_price = "12.99";
    
    
    
    /**
     *konstraktor
     */
    public Hardback(String title_,String price_,String isbn){
       // title_ += "(Hardback Edition)";
    
    super(title_,price_,isbn);
     //   String s = super.getTitle();
       // s += "(Hardback Edition)";
     //   super.setTilte(s);
        //System.out.println(super.getTitle());
        
    }
    
    /**
     *setter Price
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
     *toString Method
     */
    public String toStr(){
           
           String s = String.format ("\n Title  a %s (Hardback Edition) \nthe id  : %s \n the price  %s Euro  \n the Book ISBN-13 : %s",super.title ,super.id,this.sta_price,super.isbn_num);
           return s ;
          
           
       }
    
}
