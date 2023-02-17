//import de.uni_hannover.hci.AmjadTrablsi.aufgabe1




package data.Book;
import data.item;

/**
 *book class , the basis class for Hardback and PaperBack classes
 */
public class Book extends item{
    
    /**
     *ISBN code
     */
    protected String isbn_num = "empty";
    
    
    /**
     *kontrctor
     *
     */
    
    public Book( String title_ ,String price_,String isbn){
        
        super(title_,price_);
        
        
        this.isbn_num = isbn;
    }
    /**
     GEtter ISBN CODE
     */
    public String getIsbn(){
        
        return this.isbn_num;
    }
    
    /**
     To String Method 
     */
   public String toStr(){
          
          String s = String.format ("\n Title  : %s \nthe id  : %s \n the price  %f Euro \n the Book ISBN-13 : %d",super.title ,super.id,super.price,this.isbn_num);
          return s ;
         
          
      }
    
    
}
