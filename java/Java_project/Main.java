import java.util.ArrayList;

import pack_1.Strinc;
import pack_1.TObject;



public class Main{

    static int counter = 0; 

    static   <T>  void print(T e){

        System.out.print("\n Print number "+counter+" -->   :"+e+"\n");
        counter++;
        
        }
        

public static void main(String[] args){


TObject<Integer> t = new TObject<Integer>(4);





ArrayList<Double> list = new ArrayList<>();

int i = 10 ;

while (i > 0){

    list.add((double) i);
    i--;
}

Integer[] arr = new Integer[] {2,-4,33,99,1,2,3,4,5,6};

String[] arr2 = new String[] {"f","d","ss","a"};
t.sort(arr,9);

t.sort(arr2,3);


for(String x : arr2 ){

    print(x);
    
    }

for(Integer x : arr ){

print(x);

}


Strinc c = new Strinc("s");


String str = "f*kkl the king kkkk ff f**ck ";
print (str);

str = c.fliter(str, 'f');
print(c.fliter(str, 'f'));
print(str);
print(c.revirse(str));


}




}
