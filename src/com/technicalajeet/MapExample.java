package com.technicalajeet;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        System.out.println("MapExample");
        //declaring hasmap
        HashMap<String, Integer> courses = new HashMap<>();

//        adding value
        courses.put("core java", 4000);
        courses.put("advance java", 5000);
        courses.put("basic python", 9000);
        courses.put("advance python", 9888);
        courses.put("php", 8020);

        System.out.println(courses);

//        traversing in hasmap
        courses.forEach((key,value)->{
            System.out.print(key);
            System.out.print("=>");
            System.out.println(value);
        });

        //get single value using key
        System.out.println(courses.get("core java"));

        //another way traversing
        //entity set
        //key set
    }
}
