//import de.uni_hannover.hci.AmjadTrablsi.aufgabe1




package data;

/**
 * ITEM CLASS the basis class f
 */



public class item{
     
    /***
     *Attrbute VAriables protected to be able to use in another class , who depended in this class "extends "
     *
     */
    
    
    protected String title = "empty";
    
    protected String  id = "A" ;
    
    protected String price = "0" ;
    
    
    protected String isbn_num = "item isbn ";
    
    protected String asin = "item asin";
    
    /**
     
     kontractor
     @param ..... title , id , price  : the value  should be always postive
     */
    public item(){
        this.id += "1";
        
    }
    /**
    
    kontractor
    @param ..... title , id , price  : the value  should be always postive
    */
    public item(String title_ , String price_){
        
        
        this.title = title_;
        this.id += "1";
        this.price = price_;
        
        
    }
    
     /**
      * @return String value , title;
     
      */
    public String getTitle(){
        
        return this.title;
        
        
    }
    /**
     *SeTTER for Title ,#
     *@param String , new Title
     *
     */
    public void setTilte(String s){
        this.title = s;
    }
    
    /**
     *Getter ID
     * @return String value , id;
       
        */
    public String getId(){
        
        
        return this.id ;
    }
    
    /**
     *Getter Price
     */
    public String getPrice(){
        
        return this.price;
    }
    
    /**
     *SeTTer PRice
     */
    
    public void setP(String s){
        
        this.price = s;
        
                
    }
    
    /**
        *Getter Price
        */
    public String getP(){
        
        
        return this.price;
    }
    
    
    /**
     *To STring MEthod
     */
    public String toStr(){
        
      //  String s = String.format ("\n Title  : %s \nthe id  : %s \n the price  %s",this.title ,this.id,this.price);
      String s = String.format ("%s ",this.title );

        return s ;
       
        
    }
    
    
    /**
     * not important
     */
    public String toStr2(){
          
          String s = String.format (" Title  : %s \nthe id  : %s \n the price  %s Euro",this.title ,this.id,this.price);
        //String s = String.format ("%s ",this.title );

          return s ;
         
          
      }
    /*
     *important for the programm to be able to work in hight level of  funktionaltiy and abstarkt  ......just ignore it and dont change it
     */
    
   
    public String getAsin(){
     
        return this.asin ;
    }
    public String getIsbn(){
        
        return this.isbn_num;
    }
    
    
}
