//package model;
package model;
import model.Fraction;
import java.lang.reflect.*;




public class Main{


    
    public static void main(String[]  args){
        
        System.out.println( "\n\nAufgabe b : \n\n");
        
        Fraction x2 = new Fraction(3,6);
        
        System.out.println( x2.str());
        
        x2.setZ(4);
        System.out.println( x2.str());
        
        x2.setValues(3,9);
        System.out.println( x2.str());

        System.out.println( "\n\nAufgabe C : \n\n");
        
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(2,3);
        Fraction f3 = f1.add(f2);
        System.out.println( f3.str());

        
        
        System.out.println( "\n\nAufgabe d : \n\n");
        
        Fraction g1 = new Fraction(1,2);
        Fraction g2 = new Fraction(2,3);
        Fraction g3 = g1.multiply(g2);
        System.out.println( g3.str());
        
        
        
        
/*
       Class c = Fraction.class;
       Object obj =c.newInstance();

        Method m = c.getDeclaredMethod("extend",new Class[
                                             ]{int.class});
        m.setAccessible(true);
        m.invoke(obj,4 );
        
        
        //TESTS
        Fraction f = new Fraction(3, 6);
        System.out.println(f.str());
        //f.extend(3);
        System.out.println(f.str());
        
        */
        
        /*
               Class c = Fraction.class;
               Object obj = c.newInstance();
               Method m = c.getDeclaredMethod("extend",amount);
               m.setAccessible(true);
               m.invoke(obj,null);
               */
        
        //fraction(4,5);
    }
    
    
    
    

}
