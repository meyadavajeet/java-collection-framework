package com.technicalajeet;

import java.util.*;

public class TravaseExample {
    public static void main(String[] args) {
        System.out.println("=================== TravaseExample =========================");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ajeet");
        arrayList.add("Yadav");
        arrayList.add("Sonu");
        arrayList.add("Kumar");
        arrayList.add("Yadav");
        arrayList.add("shi hai");

        System.out.println(arrayList);

        //using foreach to traverse in array
        for (String str : arrayList) {
            System.out.print(str + "\t" + str.length() + "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("========================================");

        // Traversing using ITERATOR : forward traversing
        for (String next : arrayList) {
            System.out.print(next + "\t");
        }
    /*
    Traversing using ITERATOR : forward traversing
    using while loop
     */
        System.out.println("=========== using while loop===================");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("===================== backward traversing ================");
    /*
    Traversing using LISTITERATOR : backward traversing
    using while loop
     */
        ListIterator<String> stringListIterator = arrayList.listIterator(arrayList.size());
        while (stringListIterator.hasPrevious()) {
            String previous = stringListIterator.previous();
            System.out.println(previous);
        }

        //enumaration traversing homework
        System.out.println("=========Enumeration Traversing==========");
        Vector<String> vec = new Vector<>();
        vec.add("John");
        vec.add("Gary");
        vec.add("Susan");
        vec.add("Mike");
        vec.add("Angela");
        Enumeration enu = vec.elements();
        System.out.println("The vector elements are::");
        while (enu.hasMoreElements()) {
            Object o = enu.nextElement();
            System.out.println(o);
        }

        System.out.println("======== Foreach traversing ===========");
        //foreach traversing java 8 features
        arrayList.forEach(e -> System.out.println(e));

        //replace lamda with method refrence
        arrayList.forEach(System.out::println);

//        tree set for shorting of elements
        System.out.println("Sorting of Elements");
        TreeSet<String> set = new TreeSet<>();
        set.addAll(arrayList);
        set.addAll(vec);
        for (String s : set) {
            System.out.println(s);
        }

        //these two for the custom sorting logic
//        Comparable
//Comparator

    }
}
