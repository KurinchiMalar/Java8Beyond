
package com.in28minutes.api.a;

import java.util.ArrayList;
import java.util.List;
/*
    // List.of() --> returns immutable list -----> Java 9
    // CopyOf() available in Set, Map and List ---> Java 10

    If the collection given to copyOf() is already immutable.... no new copy created.
 */
public class CopyOfApiRunner {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jack");
        names.add("Joe");

        //doNotChange(names);
        // When you need to create immutable collection from existing collection use List.copyOf()
        //**************Demonstration - creating immutableList from existing list using List.copyOf()
        List<String> immutableCopyOfNames = List.copyOf(names);
        //doNotChange(immutableCopyOfNames); // UnSupportedOperationException
        System.out.println(immutableCopyOfNames);
        System.out.println(names == immutableCopyOfNames);

        //*************** Demonstration - Copy of doesnt create copy when source list is immutable already.
        List<String> temp = List.of("a","b","c"); // immutable
        List<String> immutableCopyOfNames2 = List.copyOf(temp);
        System.out.println(temp == immutableCopyOfNames2); // no copy created because List.of() alreadu provided an immutable ist

        List<String> tempList = List.of("a","b");
        tempList.add("c"); // UnsupportedOperationException
        System.out.println(tempList);



    }

    private static void doNotChange(List<String> names) {
        names.add("ShouldNotBeAllowed");
    }
}