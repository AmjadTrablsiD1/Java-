package model ;


/**
*this class provides multiple Methods to work with Lists and it is the carne class
*
*
*
*
*
*@author      Amjad Trablsi
*version 2.0



*/

public class ListNode{
    
    /**
     *the variable who save the value in the list . it is private so we can only change it by useing th public Methode in the same class
     *     private to save the orginal class form change

     */
    private int val ;
     /**
      recusion from the same class .
      */
    ListNode next_Node ;
    
    /**
     konstractor
     @param   int value  postiv or negativ or null  , second parameter is from the same Type this class ListNode .... it could be setting as null also
     *public cuz it will be called form main class

     */
    public ListNode( int value, ListNode next){
        
        this.val = value ;
        this.next_Node = next ;
        
        
    }
/**
 *
 @return  the value from the list in form String .
 *      *public cuz it will be called form main class

 
 */
   public String  str(){
        
        String s = String.format("%d ",this.val);
       return s ;
       
   }
    
    
    /**
     *
     *
     *geter
     *@return the value for this list .
     *     *public cuz it will be called form main class

     */
    
    
    public int get(){
        
        return this.val ;
    }
    
    
       /**
      *
      *
      *Setter
      *@param  take a integer value and set as the value form the list
        *public cuz it will be called form main class

      */
     
    
    
   public  void set(int s){
        
        this.val = s ;
    }
    
    
    /**
     
     @return the next node or list .... it could also return null when there is no node or list as Node_NExt  installiert
     *public cuz it will be called form main class

     */
    public ListNode getNext(){
        
        if (this.next_Node == null) return null ;else return this.next_Node;
        
    }
    /**
       *
       *
       *Setter
       *@param  take a ListNode  value and set as the Next_Node  form the list
    *public cuz it will be called form main class

       */
    
    public void setNext(ListNode x ){
        
        this.next_Node = x ;
        
        
    }
    /**
        *
        *
        *Setter
        *@param  take a ListNode  value and set as the this node   form the list
     *public cuz it will be called form main class

        */
       
  
    public void setThis(ListNode x ){
        
        this.val = x.get();
        this.next_Node = x.getNext();
    }
    
  
}
