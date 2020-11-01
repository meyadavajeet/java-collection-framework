package com.technicalajeet;

import java.util.HashSet;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        System.out.println("HasSet");
        HashSet<Double> nms = new HashSet<>();
        nms.add(889898.9090);
        nms.add(8989.90);
        nms.add(78.00);
        nms.add(78.00);
        nms.add(899.90);
        System.out.println("HashSet :: " + nms);

        //TreeSet
        //sort elements in accending order
        TreeSet<Double> treeSet = new TreeSet<>();
        treeSet.addAll(nms);
        System.out.println("treeSet :: " + treeSet);

    }
}
