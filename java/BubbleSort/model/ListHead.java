
package model;
import model.Bubblesort;


/**
*this class provides multiple Methods to work with  Lists and the recusion form the list .... lange liste not only one list.
*
*
*
*
*
*@author      Amjad Trablsi
**version 2.0




*/

public class ListHead{
    
    /**
     attribut form Type ListNode
     private to save the orginal class form change
     */
  private  ListNode list  ;
    
    
    
    /**
     * constravtor Method : set a value form array in long list the range as the Data Array
     *@param it take aparameter from type int Array
     *public cuz it will be called form main class
     
     */
    public  ListHead(int[] data ){
        int l = data.length ;
        this.list = (new ListNode(data[0],null));
        ListNode temp = list;
        
        for(int i = 1 ; i < l ; i++){
            
            
            if(i == l-1){
                
                temp.setNext(new ListNode(data[i],null));
                temp = temp.getNext();
            //temp.setNext(new ListNode(data[i],null));

            }else{
                temp.setNext(new ListNode(data[i],null));
                temp = temp.getNext();
                
            }
            
        }
      
    }
    /**
        * setter Method : set a value form type ListNode  as the attrbute from this class
        *@param it take aparameter from type ListNode
        * *public cuz it will be called form main class
        
        */
    public ListHead(ListNode x){
        
        this.list = x ;
    }
    
    /**
        * String  Method : convert all the value to string  usefull to print the value in the console
        *@return String
        *
         *public cuz it will be called form main class
        */
    public String str(){
        
        String sa = "";
       
        
        for(ListNode node = list ; node.getNext() != null ;node = node.getNext()){
            
            // cuz wenn the node.getNext == null the loop will strop and we will lose the last value
            if(node.getNext().getNext() == null){
                String s1 = String.format("(%d)->(%d)->null",node.get(),node.getNext().get());

                sa += s1 ;
                
            }
             
           
            if(node.getNext() != null && node.getNext().getNext() != null){
                String s0 = String.format("(%d)->",node.get());
                 sa += s0;

            }
            

          
        }
        return sa ;
        
        
    }
    
    
    //length von head list help funktion that i forget about it
    
    public  int length(){
        int i = 1;
        for(ListNode node = this.list ; node.getNext() != null ;node = node.getNext()){
            
            
            i++;
        }
            
        return i ;
    }
    
    
  
    
    
    
    /**
        * Sort Method : usefull to sort the value in the HeadList from small to big
        * *public cuz it will be called form main class
        *
        
        */
     
    public void sort(){
        int i = 1;
        // 1 we check the length from the ListHead
        for(ListNode node = this.list ; node.getNext() != null ;node = node.getNext()){
            
            i++;
        }
        //we set new array in the same length from ListHead
        int[] arr = new int[i];
        int k = 0 ;
        
        // we set the value from the listhead in the new array
    for(ListNode node = this.list ; node.getNext() != null ;node = node.getNext()){
        
        
        if(node.getNext().getNext() == null){
           arr[k] = node.get();
            k++;
            arr[k] = node.getNext().get();
            
            
        }else{
            arr[k] = node.get();
            k++;
          
        }
        
    }
        
        //we sort the array
        bubbleSort(arr);
        
      
        //make new listhead
        
        ListHead new_sort = new ListHead(arr) ;
        
        //set it as the aktueles list
        
        this.list = new_sort.list ;

    
    }
    
    
      
     
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //help funktion von Assignmnt 1
    public static void bubbleSort(int[] arr){
        int elemnt = 0 ;
        int length = arr.length;
        
        for(int i = 0 ; i < arr.length-1 ; i++){
            
            if(arr[i] > arr[i+1]){
                 elemnt = arr[i+1];
                arr[i+1]= arr[i];
                arr[i] = elemnt ;
                
            }
           
        }

        
        int j = 0 ;
        
        
        for(int i = 0 ;i < arr.length-1 ; i++){
            
            if (arr[i] > arr[i+1]) j++;
            
        }
        
        if( j != 0 ) bubbleSort(arr);
      
    }
    
    public static String arrayToString(int[] arr){
        
        String s = "[";
        for(int i = 0; i< arr.length; i++)
        {
            if(i < arr.length -1) s+= Integer.toString(arr[i]) + ",";
            if(i == arr.length -1) s += Integer.toString(arr[i]) + "]";
            
        }
        return s ;
      
    }
    
    
    
    
    /**
        * insert Method  Method : set a value in a known index
        *@param it take two parameter one for the index shoud be not negativ , the second is the int value .
        * *public cuz it will be called form main class
        
        */
    
    
   public void insert(int index , int i ){
       int l = 1;
       for(ListNode node = this.list ; node.getNext() != null ;node = node.getNext()){
           
           
           l++;
       }
       
       
       
       
       
       if(index < l){
       
        int j = 1 ;
        ListNode x = new ListNode(i ,null);
       
       if ( index == 0){
                      ListNode y = new ListNode(i ,this.list);
                      this.list = y ;
                      
                  }
       
        for ( ListNode node  = this.list;node  != null; node = node.getNext(),j++){
            
           
            
            if (j == index && j > 0 ){
                x.set(i);
                x.setNext(node.getNext());
                node.setNext(x);
              //this.list = node ;
                
                }
            

            }
       
        }
   }
    
    
    
    /**
    * insert Method  Method : set a node   in a known index
    *@param it take two parameter one for the index shoud be not negativ , the second is the ListNode value .
    * *public cuz it will be called form main class
    
    */
    
    public void insert(int index , ListNode N){
        int l = 1;
        for(ListNode node = this.list ; node.getNext() != null ;node = node.getNext()){

            l++;
        }//counter
        
        if(index < l){
                int j = 1 ;
        
        if ( index == 0){
            ListNode x = this.list.getNext();
            N.setNext(x);
            this.list.setNext(N);
            
            
            
                   }
        
         for ( ListNode node  = this.list;node  != null; node = node.getNext(),j++){
             
            
             
             if (j == index && j > 0 ){
                 ListNode y = node.getNext();
                 N.setNext(y);
                 node.setNext(N);
                 
                
                 
                 }
             

             }
        
         }
    }
    
    
    /**
    * insertAfter  Method  Method : set a List or node as  next  Node or list  : Node_Next.
    *@param one form type ListNode
    * *public cuz it will be called form main class
    
    */
    
   public void insertAfter(ListNode node){
       
       ListNode x = this.list.getNext();
       node.setNext(x);
       this.list.setNext(node);
       
       
   }
    /**
    * insert Method  Method : set a value in as the next node
    *@param  interger value
    *
     *public cuz it will be called form main class
    */
    public void insertAfter(int i){
        ListNode x = this.list.getNext();
        ListNode node =new ListNode(i,x);
        
        node.setNext(x);
        this.list.setNext(node);
        
        
    }
    
    

   
     
     
    
    
    
}
