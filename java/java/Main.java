import P1.TClass;

// import P1.TClass;


class Arr<T> {

T member ;

Arr (T x){

this.member = x ;

}


void set(T e ){

this.member = e ;

}

public T get(){
    return this.member;
}

 void print(){
System.out.print("\n\nTemplet class --->\t "+this.member+"\n\n");


}


}

class New_Array<T extends Arr<T>>{

    T new_m;

New_Array(T x){
new_m = x ;


}

int get(){

    return this.get();
}


void print(){

    System.out.print("--->"+this.new_m);


}


}





public class Main{



public static void main(String[] args){

Arr<String> l = new Arr<String>("10");

l.print();

Integer[] arr = new Integer[]  {1,5,3,77,33,8,9,0};

Integer[] a1 = new Integer[] {3, 5, 1, 7, 2, 9, 4, 6, 8};

NClass n = new NClass(10);

Comparable x = n.sort(arr,4);

System.out.print(x);








}




}
