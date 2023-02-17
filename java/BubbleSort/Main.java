package model;

import model.ListNode;
import model.ListHead;
import model.Bubblesort;

/**
 * this class provides multiple Methods to work with Lists
 *
 ** this class is tha main class ;where we call al the methods form another
 * classes
 *
 *
 *
 * @author Amjad Trablsi
 *
 *         Version 2.0
 * 
 * 
 * 
 */

public class Main {

    public static void main(String[] args) {

        ListNode n = new ListNode(555, null);
        ListNode r = new ListNode(666, null);

        // System.out.println(n.str());

        // head_list test

        System.out.println("\n\nAufgabe a : \n\n");

        int[] dataArr = { 1, 2, 3 };

        ListHead list1 = new ListHead(dataArr);

        ListHead list2 = new ListHead(new ListNode(4, new ListNode(5, null)));

        System.out.println(list1.str());
        System.out.println(list2.str());

        System.out.println("\n\nAufgabe b : \n\n");

        int[] dataArr2 = { 1, 2, 16, 4, 9 };

        ListHead list4 = new ListHead(dataArr2);
        System.out.println(list4.str());

        System.out.println("\n\nAufgabe c : \n\n");
        list4.sort();
        System.out.println(list4.str());

        System.out.println("\n\nAufgabe 1 Assingmnet 3  : \n\n");
        // list4.insert(4,99); //test insert
        System.out.println("\n\n");

        System.out.println(list4.str());
        System.out.println("\n\n");

        list4.insert(0, 88); // test insert
        System.out.println(list4.str());
        System.out.println("\n\n");

        list4.insertAfter(n);
        System.out.println(list4.str()); // test insertAfter value of n = 555
        list4.insertAfter(1111);
        System.out.println(list4.str());
        list4.insert(1, r); // test insert value of r = 666
        System.out.println(list4.str());

        System.out.println("\n\n\n\n");

        /*
         * System.out.println( "\nAufgabe b : Beispiel -> \n\n");
         * 
         * int [] dataArr1 = {5,3,1,4,2};
         * 
         * ListHead list = new ListHead(dataArr1);
         * list.sort();
         * System.out.println(list.str());
         */

    }

}
