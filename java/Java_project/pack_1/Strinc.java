package pack_1;

public class Strinc {


    String elemnet ;


    public Strinc(String s){

        this.elemnet = s ;
    }


    public String fliter(String s , char c){

            String n = "";

            for (int i = 0; i < s.length();i++ ){
                
               if( s.charAt(i) != c ){

               n=  n +s.charAt(i);

               }


            }

            s= new String(n) ;
        return n ;
    } 


    public int counter (String s , char c){

            int counter = 0;
        for (int i = 0; i < s.length();i++ ){
            
           if( s.charAt(i) == c ){

            counter ++;
           }


        }


    return counter  ;
} 


public String revirse(String s ){
    String n ="";

    for (int i = s.length()-1; i > -1 ;--i ){
            
        n=  n +s.charAt(i);



     }




    return n;


}


    
}
