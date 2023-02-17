package pack_1;


interface Debug_{

void print(String ele);


abstract String  totext();

}



public class  TObject<T>  implements Debug_{

    static int counter = 0;

    
    static boolean debug = true;
    T element;



   public  TObject(T e){


        this.element = e;
    }




    public  <T extends Comparable> void swap(T[] arr, int i , int j){


        T temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;


    }



    public <T extends Comparable> boolean if_sort(T[] arr, int len){
        boolean b = true  ;

    for (int i = 0 ; i < len ;i++){

           if( (arr[i].compareTo(arr[i+1]) < 1)){

                return false ;


           }

    }



        return true ;
}





    public <T extends Comparable> T[] sort(T[] arr, int len){


        for (int i = 0 ; i < len ;i++){

               if( arr[i].compareTo(arr[i+1]) < 1){

                    swap(arr,i,i+1);


               }

        }
            if(!if_sort(arr, len)){

               sort(arr, len-1);

            }



            return arr;
    }











    public void print( String ele){

        if(debug)System.out.print(ele);



    }


    @Override public String totext(){

        return " ";



    }


    



    
}
