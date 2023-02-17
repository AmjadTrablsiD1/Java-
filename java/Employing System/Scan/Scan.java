package Scan;
import model.Employee;
import model.type.Guard;
import model.type.IT;
import model.type.Manager;

import java.util.Scanner;


/**
*in this class will be process all the entry from the user
*
*@autua amjad Trablsi
*version 1
*/
public class Scan{
    /**
      * scanner object to be able to communicated with users
      */
    private  Scanner sc = new Scanner(System.in);

    
    private Employee[] e_list = new Employee[15];
    
    private int empo_counter = 0 ;
    String info = "";
    
    /***
    * Method Start .... give the user the information and analyse the Entry
    */
    public void start(){
        
        if(empo_counter <15){
        
       String command  = "empty";
        int index= -1;

        
        System.out.println("Command : ");

        command  = sc.nextLine();
        
        if(if_command(command))index=get_index(command);else error();
        
        //untel hier we know which type we have and we ignore all the bad commandos
        
        if(index == -1)error();

        if(index == 0) get_info_gard();
        if(index == 1)get_info_IT();
        if(index == 2)get_info_Manager();
        if(index == 3)show_employee();
        
        
        }else {
             System.out.println("no More Space an your Employees  List");
            
            System.exit(2);

        }
        
        
        
        
    }
    
    /**
    
    * get infor about Guard and add him to the Employees array
    */
    private void get_info_gard(){
        String vorname = "empty";
        String nachname = "empty";
        String ns ; //night shift
        String ss; //day shift
        String fs;  //early shift
        
        
        System.out.println("\nAdding new guard");

        System.out.println("\nFirstname  : ");

        vorname = sc.nextLine();
        
        System.out.println("\nLastname  : ");

        nachname = sc.nextLine();
        
        System.out.println("\nNight shifts (per Month)  : ");
        ns = sc.nextLine();
        int  ns_ = 0 ;
        if(isNumeric(ns))ns_= Integer.valueOf(ns );else error();
        
        System.out.println("\nEarly shifts (per mounth)  : ");
        fs = sc.nextLine();
        int  fs_ = 0 ;
        if(isNumeric(fs))fs_= Integer.valueOf(fs );else error();
        
        System.out.println("\nLate shifts (per mounth)  : ");
        ss = sc.nextLine();
        int  ss_ = 0 ;
        if(isNumeric(ss))ss_= Integer.valueOf(ss );else error();
       
        
        Guard newG = new Guard(vorname,nachname,fs_,ss_,ns_);
        this.e_list[empo_counter] = newG;
        empo_counter++ ;
        
        

        
        
        System.out.printf(" Added %s, %s  to Company  ",newG.getNN(),newG.getN());
    this.start();

    }
    
    /**
     *get info about IT Employee and add him to the Employees array
     */
    private void get_info_IT(){
           String vorname = "empty";
           String nachname = "empty";
           String range ;
           String week_hours;
           
           
           System.out.println("Adding new \"IT-personal:\" \n");

           System.out.println("\nFirstname  : ");

           vorname = sc.nextLine();
           
           System.out.println("\nLastname  : ");

           nachname = sc.nextLine();
        
           System.out.println("\nRank \"JuniorDEV\" or \"SeniorDev:\" "); // need to fixit hoer
           range = sc.nextLine();
        if(!if_IT(range)) error();
          
        
        
        System.out.println("\nWeekhours : ");
           week_hours = sc.nextLine();
           int  wh_ = 0 ;
           if(isNumeric(week_hours))wh_= Integer.valueOf(week_hours );else error();
           
          
           
           IT newIT = new IT(vorname,nachname,range,wh_);
           this.e_list[empo_counter] = newIT;
           empo_counter++ ;
           
           

           
           
           System.out.printf(" Added %s, %s  to Company  ",newIT.getNN(),newIT.getN());
       this.start();

    }
    
    
    /**
     
     * get info about Managere and add him to the Employees array
     */
    
    private void get_info_Manager(){
        String vorname = "empty";
        String nachname = "empty";
        String range ;
        
        
        System.out.println("Adding new Manager: \n");

        System.out.println("\nFirstname  : ");

        vorname = sc.nextLine();
        
        System.out.println("\nLastname  : ");

        nachname = sc.nextLine();
     
        System.out.println("\nRank \"CEO\" or \"Project Manager\": "); // need to fixit hoer
        range = sc.nextLine();
        if(!if_Manager(range)) error();

     
       
        
        Manager newManager = new Manager(vorname,nachname,range);
        this.e_list[empo_counter] = newManager;
        empo_counter++ ;
        
        

        
        
        System.out.printf(" Added %s, %s  to Company  ",newManager.getNN(),newManager.getN());
        
       // System.out.printf("\n\n%d\n\n",empo_counter);


        this.start();

    }
    
    
    
    /**
     *show Employees method
     */
    
    private void show_employee(){
        if(empo_counter == 0 ){
            System.out.println("you dont have any Employees");
            this.start();
            
        }else{
            for(int i = 0 ; i < empo_counter ; i++){
               // System.out.printf("\n\n%d\n\n",empo_counter);

                System.out.println(e_list[i].toStr());
                
            }
            
            this.start();
        }
        
        
    }
    
    
    
    /**
     error
     */
    private void error(){
        
        System.out.println("Fehler Meldung ..... Falsche Eingabe  \n "+ info);
        this.start();
    }
    
    /**
     
     * to check if the command sinnvoll
     */
    private boolean  if_command(String command){
        boolean b = false;
        String[] arr = {"new_guard","new_it","new_manager","show_employees" };
        
        
        for ( int i = 0; i < arr.length;i++){
            
            if(command.equals(arr[i]))b = true;
            
        }
        
        return b;
    }
    
/**
 help Method to get the index depended of the users " Entery"
 */
    private int  get_index(String command){
           String[] arr = {"new_guard","new_it","new_manager","show_employees" };
        int i = 0;
           
           for (; i < arr.length;i++){
               
               if(command.equals(arr[i]))break;
               
           }
           
           return i;
       }
    
    
    /**
     
     help funktion to see if we can change the value of the string to Double or intger
     */
    
    
    private boolean isNumeric(String strNum) {
           if (strNum == null) {
               return false;
           }
           try {
               double d = Double.parseDouble(strNum);
           } catch (NumberFormatException nfe) {
               return false;
           }
           return true;
       }
    
    
    /**
       help method to check if the Eingabe richtig ist
       */
    private boolean  if_IT(String command){
        boolean b = false;
        String[] arr = {"SeniorDev","JuniorDev" };
        
        
        for ( int i = 0; i < arr.length;i++){
            
            if(command.equals(arr[i]))b = true;
            
        }
        
        return b;
    }
    /**
     help method to check if the Eingabe richtig ist
     */
    private boolean  if_Manager(String command){
          boolean b = false;
          String[] arr = {"CEO","Project Manager" };
          
          
          for ( int i = 0; i < arr.length;i++){
              
              if(command.equals(arr[i]))b = true;
              
          }
          
          return b;
      }
    
    
    
}


