package pack_1;


public class Debug {

    static int pcounter = 0;
    
  public   boolean debug = true ;

public Debug ( ){

System.out.print("\nnDebug is on \n");

}


public void off(){

    this.debug = false ;
}

public void on(){

    this.debug = true   ;
}



public <T> void print( T ele){

    if(debug)System.out.print("\n"+ele+"\n");



}

public <T>void cprint( T ele , int count){

    int counter = 0;

    if(debug)System.out.print("print number "+counter+"----> :   "+ele+"\nEnd oF Print\n");



}



public <T> void p_arr(T[] arr){

    for (T e : arr){

            print(e);

    }
    print("end of print Array\n");
}
}


