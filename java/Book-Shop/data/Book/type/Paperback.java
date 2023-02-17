//import de.uni_hannover.hci.AmjadTrablsi.aufgabe1



package data.Book.type;
import data.Book.Book;


/**
 * paperback class
 */

public class Paperback extends Book{
     
    /**
     *standard prise
     *private to save the orginal class from change
     */
    private String sta_price = "9.99";
    
    /**
     *konstractor
     *@param title ,price, ISBN nummber
     */
    
    public Paperback(String title_,String price_,String isbn){
        
        super(title_,price_,isbn);
        
        
    }
    /**
     *Setter form price
     */
    public void setP(String s){
        
        this.sta_price = s ;
        
    }
    
    /**
     *getter  Price
     */
    public String getP(){
        
        
        return sta_price;
    }
    
        
    /**
     *to string method
     */
    public String toStr(){
           
        String s = String.format ("\n Title  a %s  \nthe   the price  %s Euro \n the Book ISBN-13 : %s",super.title ,this.sta_price,super.isbn_num);
           return s ;
 
}
}

