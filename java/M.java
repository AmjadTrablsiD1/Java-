import java.util.*;



class Sort{



//Biniar search implemntieren 


public int biniar_search_(ArrayList<Integer> arr,int value){
int result = 0;

int mitte = arr.size()/2;

if(arr.get(mitte+1) == value )return value ;else if(arr.get(mitte+1) > value ){

    mitte = (mitte/2)+1;
    


}



return result ;
}


}


class Debug{


public boolean b = true ;




public Debug(){

this.b = true;

}

public <T> void print(T e){

if(b)System.out.print(e+"\n");


}



}


class StringC{



public String string_filter(String s,char x){

 String new_String =  "";

for(char c : s.toCharArray()){
if(c != x)new_String +=c;else if(c == x) new_String += '*';

}
return new_String;

}


}







 class M implements Comparable <M>  {

int value ;

String name ;

public  M (int v ,String s){

    this.value = v;
    this.name = s;
    
    
    }


    public  M(){

this. value = 0;
this.name = "empty";


}




public String toString(){

String s = String.format("the Value is : %d     und the name is :     %s",value,name);

return s ;

}

@Override public int compareTo(M another_M){


return Integer.compare(this.value,another_M.value);

}


public static void main(String[] args){

Debug d = new Debug();

Random rand = new Random();

//Comparable 
M m = new M(5,"s");
M new_m = new M();

d.print(m.toString());
d.print(new_m.toString());

// Comprare Teil ..... 

ArrayList<M> arr_m = new ArrayList<>();

int i = 0;
while(i< 10){

arr_m.add(new M(rand.nextInt(100),"element : "+i));
i++;

}
for(M e : arr_m)d.print(e.toString());

Collections.sort(arr_m);

for(M e : arr_m)d.print(e.toString());

//comprator Teil 

ArrayList<B> new_arr = new ArrayList<>();

int j = 0;
while(j < 20){

    new_arr.add(new B(rand.nextInt(500)));

    j++;
}

for(int k = 0; k < 5;k++)d.print("\n"); // leere line

for (B ee : new_arr)d.print("   -  "+ee.value);

Collections.sort(new_arr);


d.print("\n");
for (B ee : new_arr)d.print("   -  "+ee.value);


// Class String 


StringC c = new StringC();

d.print(c.string_filter("fuck the King kkk",'k'));


}


}


 