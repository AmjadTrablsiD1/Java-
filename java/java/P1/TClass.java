 package P1;



 public class TClass <T> {

    T value ;


   public TClass (T v ){

        this.value = v;


    }


    public void Print(){

            System.out.print("\n\nTClass Value ----> " + this.value +"\n\n");


    }
    
}
