package scanner;


import data.item;
import  data.Book.Book;
import data.Book.type.Paperback;
import data.Book.type.Hardback;
import data.DiscMedia.DiscMedia;
import data.DiscMedia.type.CD;
import data.DiscMedia.type.DVD;
import data.DiscMedia.type.BlueRay;
import java.util.Scanner;



/**
 *in this class will be process all the entry from the user
 *
 *@autua amjad Trablsi
 *version 1
 */
public class Scan{
    /**
     '* item array  private to save the class form change
     */
    private item[] n_item= new item[5];
    /**
     counter s
     */
    private int cd_ = 0;
    private int dvd_ = 0 ;
    private int blueray_ = 0 ;
    private int hb_ = 0;
    private int pb_ =0 ;
    //iteam x = new item();
   // n_item[0] = x;
  /**
   * scanner objekt to be able to communicated with users
   */
    
   private  Scanner sco = new Scanner(System.in);
/**
 counter  not important
 */
    int item_zahl = 0;
/***
 * MEthod Start .... give the user the information and analyse the Entry
 */
    public void start(){
        
        System.out.println("Enter your command : ");
        if(item_zahl == 0)set_arry(n_item); // need to be install

      
            
        
        String command  = "empty";
               int x= 0;
           int j = 0;
           
        if(sco.hasNextInt()){     //save value as integer
                             x = sco.nextInt();
               j++; //helper
              // command = int.toString(x);
                            
                     }else  command  = sco.nextLine();   //save value as String
           //command analyse
           if(j == 0 ){     //spilt  , if we have a string not a value
               
               String[] spa = command.split(" ");
               if(spa[0].equals("list")){                //first case
                   String s1 = String.format(" \n Please enter your command : \n 1 : %s \n 2 : %s \n 3 : %s \n 4 : %s \n 5 : %s ",n_item[0].toStr(),n_item[1].toStr(),n_item[2].toStr(),n_item[3].toStr(),n_item[4].toStr());
                             
                         System.out.println(s1);
                   start();
                   
                   
               }else if( spa[0].equals("add") ){ // add case
               
               
               
               
               //if(!spa[0].equals("add"))   // error();
               
                   
                   
              
               int amount = 0;
                 // if not add the first word
               if(isInteger(spa[1])) amount = Integer.valueOf(spa[1])-1;else  error();     //save the value as integer
            //String c_s =
                   if(!(n_item[amount].getTitle().equals("empty"))){
                       
                       System.out.printf("this solt is already taken by :\n %s \n",n_item[amount].getTitle());
                       start();
                   }
                   
                   
                   
               //to know wich type
               String type_ = "empty";
               
               if(isType(spa[2])) type_ = spa[2];else error();
               String[] type = {"hardback","paperback","cd","dvd","blueray"};
                      
               int h = 0; // help to know which type we have
               //to get the index of the type
               for (int i = 0 ; i < type.length;i++){
                           
                   if (type_.equals(type[i])) break ;
                                h++;
                           
                       }
            
               get_info(h,amount);
               checkif(); // to see if there free space in the array to ask again if not you will have the bill
               }else if (spa[0].equals("stat")){
                   double summe = 0 ;
                              String s = "";
                              for(int i = 0 ; i < n_item.length;i++){
                                  
                                  s =  n_item[i].getP();
                                 summe += Double.parseDouble( s );
                                  
                              }
                              
                   System.out.printf(" Your inventory is worth  %.2f \n your inventory contained :\nbook: \t\t  %d\n   Paperback :    %d\n   Hardback:      %d\nDiskmedia:        %d\n CD:     \t  %d\n DVD:    \t  %d\n Blueray:\t  %d \n ",summe,this.hb_+this.pb_,pb_,hb_,dvd_+cd_+blueray_,cd_,dvd_,blueray_ );
                   start();
                   
                   
               }else if (spa[0].equals("take")){
                   int val = 0 ;
                   if(isInteger(spa[1])) val = Integer.valueOf(spa[1])-1;else  error();     //save the value as integer
                   if(n_item[val].getTitle().equals("empty")){
                       
                      System.out.println("this solt is empty");
                       
                   }else { // need to find out the text format for this shit
                       
                       if(n_item[val] instanceof Book){
                           String ispn_code =n_item[val].getIsbn();
                           
                             System.out.printf("you have taken the book \"%s\" with the ISBN-13 \"%s\" out of the inventory . it costs %s ",n_item[val].getTitle(),ispn_code,n_item[val].getPrice());
                           
                       }
                           
                           
                         
                       
                       if(n_item[val] instanceof DiscMedia)System.out.printf("you have taken the Disk Media \"%s\"  with the ASIN \"%s\" out of the inventory . it costs %s $ \n ",n_item[val].getTitle(),n_item[val].getAsin(),n_item[val].getP());

                       
                   }
                       
                   start();
                   
                   
                   
               }else error();
               
           }
        
        
    }
    
    
    /**
     *help funktion  ... see which type of item  and ask the user to write the information
     *@param  int t .... help variable, index
     *
     */
    public void get_info(int t , int index ){
        
        if(t <5 || t >= 0 ){
            
            if (t ==0){
                //hardback
                System.out.println("Adding a Hardback book to the inventory \nplese enter the title :  ");
                
                String title_ = sco.nextLine()+"(Hardback Edition)";
                
                
                System.out.println("\n plese enter the ISBN-13 code :  ");
                
                String isbn_ =sco.nextLine();
               
                
                if(if_exist_isbn(isbn_)){
                    System.out.println("this isbn is not gültig");error1();
                    
                }
                    

                if(!if_Asin(isbn_) && !isInteger(isbn_)) error();

              //  if(!isInteger(isbn_) && isbn_.length() == 13) error();      //save the value as integer

                
                
                
                System.out.println("\n plese enter the prise (d for defult)   :  ");

                String price_ =sco.nextLine();
                // need to prouf of is double or not
                int p = 0 ; // help variable
                if(price_.equals("d")) price_ = String.valueOf(12.99);else {
                    
                    if(isNumeric(price_)){
                        price_ = String.valueOf(price_);p++;
                    }else error();
                }
                System.out.println(price_+"\n\n\\n\n");
                
                
                Paperback bb = new  Paperback(title_, price_, isbn_);
                //String s = bb.getTitle();
                    //String  ss = "(Paperback Edition)";
                     // bb.setTilte(bb.getTitle() + ss);
                
                if( p != 0 )bb.setP(price_);
                this.n_item[index] = bb;
                System.out.println(bb.toStr());
                item_zahl += 1;
                hb_ += 1;
                System.out.println("\n the book was entred to invntory  ");

            }
            if (t ==1){
                           //paperback
                
                System.out.println("Adding a Paperback book to the inventory \nplese enter the title :  ");
                             
                             String title_ = sco.nextLine()+"(Paperback Edition)";
                             System.out.println("\n plese enter the ISBN-13 code :  ");
                             
                
                
                             String isbn_ =sco.nextLine();
                if(if_exist_isbn(isbn_)){
                                   System.out.println("this isbn is not gültig");
                        error1();
                                   
                               }
                                   
                
                            if(!if_Asin(isbn_) && !isInteger(isbn_)) error();

                             System.out.println("\n plese enter the prise for defult d  :  ");

                             String price_ =sco.nextLine();

               
                            int p = 0 ; // help variable
                if(price_.equals("d")) price_ = String.valueOf(9.99);else {
                                   
                                   if(isNumeric(price_)){
                                       price_ = String.valueOf(price_);p++;
                                   }else error();
                               }
                             Paperback pb = new  Paperback(title_, price_, isbn_);
                                if( p != 0 )pb.setP(price_);

                             this.n_item[index] = pb;
                             System.out.println(pb.toStr());
                             item_zahl += 1;
                pb_ +=1;
                             System.out.println("\n the book was entred to invntory  ");

                           
                       }
            if (t ==2){
                            System.out.println("Adding a CD to the inventory \nplese enter the title :  ");
                                        
                                        String title_ = sco.nextLine()+"(DiskMedia)";
                
                
                    System.out.println("\n plese enter the prise for defult d  :  ");
                                                       String price_ =sco.nextLine();

                
                                int p = 0 ; // help variable
                if(price_.equals("d")) price_ = String.valueOf(8.99);else {
                                                  
                                                  if(isNumeric(price_)){
                                                      price_ = String.valueOf(price_);p++;
                                                  }else error();
                                              }
                
                                        System.out.println("\n plese enter the ASIN code :  ");
                                       
                                        String isbn_ =sco.nextLine();

                if(if_exist_Asin(isbn_))error1();

                                      
                
                                       // if(price_.equals("d")) price_ = String.valueOf(9);else price_ = String.valueOf(price_);
                                        
                                        CD cd = new  CD(title_, price_, isbn_);
                                        if( p != 0 )cd.setP(price_);

                                        this.n_item[index] = cd;
                                        System.out.println(cd.toStr());
                cd_ += 1 ;
                                        item_zahl += 1;
                                        System.out.println("\n the CD was entred to invntory  ");

                           
                       }
            if (t ==3){
                           //dvd
                           System.out.println("Adding a DVD to the inventory \nplese enter the title :  ");
                                                               
                                                               String title_ = sco.nextLine()+"(DiskMedia)";
                                                               System.out.println("\n plese enter the ASIN code :  ");
                                                               
                                                               String isbn_ =sco.nextLine();
                                                                if(if_exist_Asin(isbn_))error1();

                                                               System.out.println("\n plese enter the prise for defult d  :  ");
                
                                                               String price_ =sco.nextLine();
                                                                int p = 0 ; // help variable
                if(price_.equals("d")) price_ = String.valueOf(9.99);else {
                    
                    if(isNumeric(price_)){
                        price_ = String.valueOf(price_);p++;
                    }else error();
                }
                                                               
                                                               DVD dv = new  DVD(title_, price_, isbn_);
                                                                if( p != 0 )dv.setP(price_);

                                                               this.n_item[index] = dv;
                                                               System.out.println(dv.toStr());
                                                               item_zahl += 1;
                dvd_ +=1;
                                                               System.out.println("\n the DVD was entred to invntory  ");
                       }
            if (t ==4){
                           //blueray
                           System.out.println("Adding a BlueRay to the inventory \nplese enter the title :  ");
                                                               
                                                               String title_ = sco.nextLine()+"(DiskMedia)";
                                                               System.out.println("\n plese enter the ASIN code :  ");
                                                               
                                                               String isbn_ =sco.nextLine();
                
                if(if_exist_Asin(isbn_))error1();

                                                               System.out.println("\n plese enter the prise for defult d  :  ");

                                                               String price_ =sco.nextLine();
                                                                int p = 0 ; // help variable
                                                                                                                                                           if(price_.equals("d")) price_ = String.valueOf(12.99);else {
                                                                                                                                                               
                                                                                                                                                               if(isNumeric(price_)){
                                                                                                                                                                   price_ = String.valueOf(price_);p++;
                                                                                                                                                               }else error();
                                                                                                                                                           }
                                                               BlueRay br = new  BlueRay(title_, price_, isbn_);
                                                                if( p != 0 )br.setP(price_);

                                                               this.n_item[index] = br;
                                                               System.out.println(br.toStr());
                                                               item_zahl += 1;
                blueray_ +=1 ;
                                                               System.out.println("\n the BlueRay was entred to invntory  ");
                       }
        
        
        
        }
        
    }
    /***
     *method to see if we want too add something else
     *only work if there is a free space in the array
     */
    
    public void checkif(){
        
        
        //System.out.println(" Enter your command : "); // messge
        
        if(item_zahl < 5 ){
            
            start();
            
            
            
        }else {
            double summe = 0 ;
            String s = "";
            for(int i = 0 ; i < n_item.length;i++){
                
                s =  n_item[i].getP();
               summe += Double.parseDouble( s );
                
            }
            
            System.out.printf(" you have now 5 iteam \n the summe is ; %.2f ",summe );
        
        
        
        }
    }
    
    
    /**
     
     *help funktion to see if  writen command belong fot item types
     @param String : command
     */
    
    public boolean isType( String s){
        boolean b = false ;
          String[] type = {"hardback","paperback","cd","dvd","blueray"};
        for (int i = 0 ; i < type.length;i++){
             
            if (s.equals(type[i])) b=  true ;
             
         }
    
    
        return b ;
    
    

}
  /*
     *help funkteion is integer cheak if the string can be converted to integer
   *@param string
  * @return boolean
     *
     */
    private   boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
    
    
    /**
     *error method
     */
    public void error(){
        
        System.out.println("fehler meldung ..... falsche Eingabe ");
        System.exit(2);
    }
    
    public void error1(){
        
        System.out.println("fehler meldung .this isbn/asin is not gültig");
        System.exit(2);
    }
    
    public void set_arry(item[] n_item){
        
        for(int i = 0 ; i < n_item.length; i++){
              item l = new item();
              n_item[i] = l;
              
              
          }
    }
    /**
     
     
     *help funktion to see if ASIN code gultig ist
     @param s string ... ASIN_  Entry;
     @return true or false
     */
    public boolean if_Asin(String s){
       boolean b = false ;
        
        if (s.length() == 14 ){
            String[] s_a  = s.split("");
            if(s_a[3].equals("-"))b = true ;
                   
            
            
        }
            
            //System.out.println("should be 13 digit with - in the 4 potion ");b;
       return b;
        
        
    }
    /**
     
     *help Funktion   for Asin code
     */
   public String addChar(String str, char ch, int position) {
       int len = str.length();
       char[] updatedArr = new char[len + 1];
       str.getChars(0, position, updatedArr, 0);
       updatedArr[position] = ch;
       str.getChars(position, len, updatedArr, position + 1);
       return new String(updatedArr);
   }
    
    /**
     *help funktion
     */
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    /**
     *help funktion to se if asin or isbn is already for another item  belong
     */
    public boolean if_exist_isbn(String isbn){
       boolean b = false  ;
        
        for (int i = 0 ; i < this.n_item.length;i++){
            
            if(n_item[i].getIsbn().equals(isbn)) b = true ;
        }
        return b ;
        
    }
    
    /**
     *help funktion to se if asin or isbn is already for another item  belong
     *
     *
     */
    public boolean if_exist_Asin(String asin){
       boolean b = false   ;
        
        for (int i = 0 ; i < this.n_item.length;i++){
            
            if(asin.equals(n_item[i].getAsin())) b = true ;
            
        }
        return b ;
        
    }
    
    
}
