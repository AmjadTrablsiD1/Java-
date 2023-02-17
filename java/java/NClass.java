public class NClass {


    int value ;


    NClass(int e){this.value =e;}


    int get(){

        return this.value;
    }



    public <T extends Comparable> void swap(T[] arr, int i , int j){

        T temp = arr[i];
        arr[i ] = arr[j];
        arr[j] = temp;

    }

    public  <T extends Comparable> T sort (Integer[] arr, int length){


        int mitte = length/2;

        int i = 0 ;
        int j = length ;

        while (i<j ){

            



        }
    


        return arr;

    }



    void print(){

        System.out.print("\nNClass value : ->    "+value+"\n\n\n");

    }

    




    public <T extends Comparable> T[] make(T[] arr, int lenght){

        int i = 0;
        while( i< lenght-1){
        
            if(arr[i].compareTo( arr[i+1]) != 0){
               
                this.swap(arr, i, i+1);
                
        
            } 
        
        
        
        }

        return arr;
        
        
        }


	public <T extends Comparable >  T sort(T[] arr, int length) {

        
		return null;
	}
    
}
