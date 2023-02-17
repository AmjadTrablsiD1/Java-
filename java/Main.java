import java.lang.*;

class Array <T extends comprable>{

    T[] array;


    public Array(){
            System.out.print("new Array");

    }

    
public < T> T[] new_array(T n ,int len){

    array = new array[len];

        for (int i = 0; i< 0 ;i++){

            array[i] = n;

        }

return array ;


}




}


public class Main{



public static void main(String[] argc){


System.out.print("First Line ");

Array arr = new Array();
//arr.new_array( 10.0,10);

}

}