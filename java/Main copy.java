
import java.util.*;


enum nievau{
Good,
Bad,
mittle

}




abstract class Abs{


 void print(){System.out.print("fuck");};

 void get(){}
}



class  F {

    String element;

public <T> void print(T s){


System.out.print(s +"\n");

}
 public F(){

this.element = "the element on constractor ";
print(element); 


}



}

class Wurzel{

int value ;


public Wurzel(int v){

this.value = v;

System.out.print("the value of class Wurzel : "+this.value);


}

}




public class Main{
 
 
    public static void print(String s){

        System.out.println(s + "\n");
        
        }

public static void  main(String[] args){
F f = new F();


String[] array_string = {"one ", "tow","three"};


for(String i : array_string)print(i);



// Scanner s = new Scanner(System.in);
// int i = s.nextInt();

ArrayList <Integer> arr = new ArrayList<>();

for(int i = 0;i < 10;i++){


    arr.add(i*-24);
}
arr.forEach((n->{f.print("element :"+n);})); //lambda Expretion



Collections.sort(arr);
f.print("after sort");

for(int i : arr){f.print(i);}


HashMap <Integer,String> hash = new HashMap<>();

hash.put(1,"fuck");
hash.put(2,"you");
f.print(hash);

for (String i : hash.values())f.print(i);



}




}