package com.technicalajeet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is the first code of collection framework");

        /*
        Creating  collection
        1. TypeSafe collection - Same type of elements(objects) are added to collection.
        2. Non-TypeSafe Collection - Different types of elements(objects) can be added.
         */
        //TypeSafe Collection
        ArrayList<String> name = new ArrayList<>();
        name.add("Ajeet");
        name.add("Yadav");
        name.add("Kajal");
        name.add("kumari");
        System.out.println("Type Safe collection ");
        System.out.println(name);
        System.out.println(name.get(0));
        System.out.println(name.get(1));

        //Un Type Safe or Non-Type Safe collection
        LinkedList list = new LinkedList();
        list.add("Code until you live");
        list.add("Live for code");
        list.add(1234);
        list.add(90.89);
        list.add(true);
        System.out.println("Non type safe collection ");
        System.out.println(list);
        System.out.println(list.get(4));

//        stack
        Vector<String> vc = new Vector<>();
        vc.add("jio");
        vc.add("dhana");
        vc.add("dhan");
        vc.add("Ajeet");
        vc.add("Yadav");
        vc.add("Kajal");
        vc.add("kumari");
        vc.addAll(list);
        System.out.println(vc);
        System.out.println(vc.get(2));

        //remove element
        System.out.println(vc.remove("jio"));
        System.out.println(vc);

        //size
        System.out.println(vc.size());

        //check item present in collection or not
        //if present return true if not return false
        //basically it calls the equals method of the given argument type
        System.out.println(vc.contains("Ajeet"));

        //remove
        System.out.println(vc.remove("dhana"));
        System.out.println(vc);

        //setting element
        // set-> replace the element
        // add -> add value at the index position given and the next one shifted to next index position and so on...
        vc.set(0, "Ajju bhai");
        System.out.println(vc);
        vc.add(0, "Ajeet Bhaiya");
        System.out.println(vc);

        //remove all elements of any collection
//        name.clear();
//        System.out.println(name);




    }
}
