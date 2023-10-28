import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author  : Amjad Trablsi
 * 
 *
 *
 *  die Lösung enthalt nur eine  Class Main .
 */



public class Main {





//help function
    public static int counter ( String s, char c ){
        int i = 0;
        int counter = 0;
        while(i < s.length()){

            if(s.charAt(i) == c){
                counter++;
            }



            i++;
        }

        return counter;
    }


//print Function
    public  static <T> void  print_(T ele ){
        System.out.print(" -->  "+ele+"\n\n");

    }

    //Debug Function

    public  static <T> void  print(T ele ){
        boolean depug= false ;
      if(depug)  System.out.print(ele +"\n\n");

    }

//check if digit or ()/+
    public static boolean check_if_legal_Char(String s){

       for (int i = 0; i < s.length();i++){

           if(!Character.isDigit(s.charAt(i)) ){
               // return false ;
              if( s.charAt(i) != '/' && s.charAt(i) != '+' && s.charAt(i) != '(' && s.charAt(i) != ')'){

                  print_("Illegal input -> " + s.charAt(i));
                  return false;
              }

           }
       }

            return true ;
    }

//check if all number im Number_Array are in correct form and correct  the wrong one
    public static ArrayList<String> check_Number(ArrayList<String> zahlen){

            print("   *   at the start of check_number "+zahlen);

            if(zahlen.size() == 2 ){

                if(zahlen.get(0).contains("/") || zahlen.get(1).toCharArray()[0] == '/'){

                    if(zahlen.get(1).toCharArray()[0] == '/' ){
                        print("  +++++++       in secind if cheak_number " );
                        String new_Zahl = zahlen.get(0)+zahlen.get(1);
                        zahlen.set(0,new_Zahl);
                        zahlen.remove(1);
                    }else   if(zahlen.get(0).toCharArray()[zahlen.get(0).length()-1] == '/' ){
                        print("  +++++++       in secind if cheak_number " );
                        String new_Zahl = zahlen.get(0)+zahlen.get(1);
                        zahlen.set(0,new_Zahl);
                        zahlen.remove(1);
                    }


                }


            }



        int i = 0;
        while(i < zahlen.size()-1){

            if(zahlen.get(i).contains("/")){
                if(zahlen.get(i).toCharArray()[0] == '/' && i != 0){
                        print("   *+       in Second if cheak_number " );
                    String new_Zahl = zahlen.get(i-1)+zahlen.get(i);
                    zahlen.set(i,new_Zahl);
                    zahlen.remove(i-1);
                }else if(zahlen.get(i).toCharArray()[zahlen.get(i).length()-1] == '/'&& i+1 < zahlen.size() ){

                    String new_Zahl = zahlen.get(i)+zahlen.get(i+1);
                    zahlen.set(i,new_Zahl);
                    zahlen.remove(i+1);

                }


            }

            i++;
        }

        print("   *   at the end of check_number "+zahlen);

        return  zahlen ;

    }




//die Rand Bedenungen der Aufgabe a-e
public static boolean check_If_Valid(String s ) {

//same logic as in Solve to seprate the Widerstande from the +/() , need to be done if the Function check_a
    ArrayList<String> zahlen = new ArrayList<>();

    String temp = "";
    int start = 0;

    char arr[] = s.toCharArray();
    //for(char c : arr)System.out.print(c+"  " );

    while (start < arr.length) {


        if (arr[start] != '+' && arr[start] != '(' && arr[start] != ')' && arr[start] != '/') {

            //hier useful to cheak how much R we have .. could be use in counter

            temp += arr[start];

        }else{
            if(!temp.equals(""))zahlen.add(temp);
            temp ="";
        }

        start++;
    }

    if (!temp.equals("")) {
            zahlen.add(temp);


        }
    temp = "";

    //check if Integer
    for( String c : zahlen){

        try {
            Integer.parseInt(c);
        }
        catch (NumberFormatException e){
            print_("there is not Integer Value ");
            return false;
        }

    }

    //Check if there are more then 15 Widerstand
    if(zahlen.size() > 15)return false ;
      //  print_("in check_c "+zahlen + "    " + operation);

        return true;


    }





//the most Important Function , Hier is the logic and the Recusion
    public static double solve(String str){

        //if(!check_a(str))return -1;

          ArrayList<String> zahlen     = new ArrayList<>();
          ArrayList<String> operation  = new ArrayList<>();
          double summe = 0;

        String temp = "";
        int start = 0;

        char arr[] = str.toCharArray();


//take the String apart , wiederstände , operationen , recusion
        while(start <  arr.length){


            if(arr[start] != '+'  && arr[start] != '(' && arr[start] != ')'){

                temp += arr[start];

            }
            //Recusion call if there is another level of Wiederstände
            else if(arr[start] == '('){
                    boolean found = false ;

                    int counter_ = counter(str,')');

                    print("counter is : "+ counter_);

                    ++start;

                    String recusion = "";

                while (  start < arr.length ){
                     // arr[start] != ')'

                    if(arr[start] == ')' && counter_ == 0){ break;}
                    if ( arr[start] == ')' && counter_ != 0   )counter_--;
                     //  if(arr[start] == ')' ){ break;}

                    if(arr[start] != ')')recusion +=arr[start];else break;
                    print("in while recusion is : "+recusion);

                  if(start < arr.length)  start++;

                }

                print("in ( condition -> temp is : " + recusion);
                print("--->Recusion Ergebniss () is : " + solve(recusion)+ "   temp is "+ temp);

               temp += solve(recusion);  //                 ------->RECUSION<-------

                print ("recusion + temp is  :"+temp);
                zahlen.add(String.valueOf(solve(temp)));
                temp = "";

                // End if (
            }

            else if(arr[start] == '+') {

                if(!temp.equals(""))zahlen.add(temp);
                temp ="";
                operation.add(""+arr[start]);


            }
            start++;
        }
        if(!temp.equals("")) {
            zahlen.add(temp);
            temp = "";

        }
        print("at the end of the cheak_context the summe : "+ summe +"   " + zahlen + operation);

        summe += calculation(zahlen,operation);    // Calculation the Sum of All Wiederstände

        print("in cheak_context after cal  summe : "+ summe );

        print(zahlen + "    "+ operation );

        return summe;

    }



//check the String if there are a Parallel Widerstände
    public static String check_Paralel(String s){
        double div = 0;
        boolean found = false ;

        char arr[] = s.toCharArray();


            //cheak if there is a / operation saved
            String zahl_1 ="";
            String zahl_2 ="";

            for(char c : s.toCharArray()){
                if(c != '/' && !found ){

                    zahl_1 += c ;

                }else if(c == '/') {
                    found = true ;
                    continue;

                }else {

                    zahl_2 +=c;
                }

            }

            if(found) {
                 div = (Double.parseDouble(zahl_1) * Double.parseDouble(zahl_2)) /(Double.parseDouble(zahl_1) + Double.parseDouble(zahl_2));
                print("div is : "+div);
            }



        if (found) return String.valueOf(div);else return s;


    }



    //Calculation used  inside Solve to return the last sum
    public static double calculation(ArrayList<String> zahl , ArrayList<String> op){

                ArrayList<String> zahlen = check_Number(zahl);
                print("----*----cheak Number :"+ zahlen);

                double summe = 0;

//if there is only one element in Number Array
        if(zahlen.size() == 1 ){
                print("check div test : " + check_Paralel(zahlen.get(0)));

            return Double.parseDouble(check_Paralel(zahlen.get(0)));
        }

//if there is standert amount to calculate
        print("in cal size is = :" + zahlen.size() + "   "+ op.size()+1);
        if(zahlen.size() == op.size()+1){
            int k = 0;
            while(k < zahlen.size()){
                //cheak if there is a / operation saved
                String s = zahlen.get(k);
                String zahl_1 ="";
                String zahl_2 ="";
                boolean found = false ;

                for(char c : s.toCharArray()){
                    if(c != '/' && !found ){

                        zahl_1 += c ;

                    }else if(c == '/') {
                      found = true ;
                        continue;

                    }else {

                        zahl_2 +=c;
                    }

                }

                if(found) {
                   double div = (Double.parseDouble(zahl_1) * Double.parseDouble(zahl_2)) /(Double.parseDouble(zahl_1) + Double.parseDouble(zahl_2));
                    print("div is : "+div);
                  zahlen.set(k,String.valueOf(div));
              }
                k++;
            }


            int i = 0;
            print("True   ++++");
            int j = 0;
            while(i < zahlen.size()-1){

                if(op.get(j).equals("+")) {
                        double d = Double.parseDouble(zahlen.get(i));
                        double d_= Double.parseDouble(zahlen.get(i+1));
                    j++;

                         print("summe "+d +"   "+d_);
                    summe += d_ +d ;
                }
                else if (op.get(j).equals("/")){

                  //  int d = 1%Integer. parseInt(zahlen.get(i));
                   // int d_= 1/Integer. parseInt(zahlen.get(i+1));
                    double d = Double.parseDouble(zahlen.get(i));
                    double d_= Double.parseDouble(zahlen.get(i+1));
                    j++;

                    summe += d / d_ ;
                    print("summe after /  d: "+ d +" d_ :  "+d_ + "summe is " +summe);



                }
                i +=2;
                if(i == zahlen.size()-1){
                    if (op.get(j).equals("/")) {
                        summe /= Double.parseDouble(zahlen.get(i));
                    }else if(op.get(j).equals("+")){

                        summe += Double.parseDouble(zahlen.get(i));

                    }

                }

            }
        }

        return summe ;
    }

    public static void main (String[] args){

/*
        String test1 = "10/10+5";

        String test2 = "(5/5+5/5)";

        String test3 = "(220/470)";

        String test4 = "820+(470/(120+(560/680)))";

        String test5 = "((200+490)/130)+910";

        String test6 = "((340/690)/30)+(885/220)";

//Tests to check the validation of the Input


        if(check_a(test6 ) && check_c(test6))print_("true");else print_("false");
        if(check_a(test5) && check_c(test5))print_("true");else print_("false");
        if(check_a(test4) && check_c(test4))print_("true");else print_("false");
        if(check_a(test3) && check_c(test3))print_("true");else print_("false");
        if(check_a(test2))print_("true");else print_("false");



        System.out.printf("---test 1 10/10+5-> 10   Summe %.0f \n", solve(test1));
        System.out.printf("---test 2 (5/5+5/5)-> 5    Summe %.0f \n", solve(test2));
        System.out.printf("---test 3 (220/470)-> 150  Summe %.0f \n", solve(test3));
        System.out.printf("---test 4 820+(470/(120+(560/680)))-> 1044 Summe %.0f \n", solve(test4));
        System.out.printf("---test 5  ((200+490)/130)+910-> 1019 Summe %.0f \n", solve(test5));
        System.out.printf("---test 6 ((340/690)/30)+(885/220)  -> 203  Summe %.0f \n", solve(test6));


        Scanner s = new Scanner(System.in);
        print_("HAllO and WElCOME \n   Enter your Input to calculate the Schaltung or q to Quite the Programm");


        while(s.hasNext()){
            String input = s.nextLine(); // 100+200+(30/10)

            print_("Input is "+ input);

        if(check_if_legal_Char(input ) && check_If_Valid(input)) {

            System.out.printf("   the Solution to your Input :  %.0f \n", solve(input));







        }
    }
     */










        ArrayList<Integer> arr = new ArrayList<Integer>();

        int i = 0;
        while(i++ < 10){
            arr.add(i);

        }
int temp = -1;
        for(int  x : arr){
         //   print_(x);
            if(x % 2 == 0){
                //print_("found");
                temp = x;
            }

        }
print_(temp );
        print_(arr);

}
}
