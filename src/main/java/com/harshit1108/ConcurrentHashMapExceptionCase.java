package com.harshit1108;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExceptionCase {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        // Attempt to modify the map while iterating
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getKey().equals("two")) {
                map.put("four", 4); // This will throw ConcurrentModificationException.
                // This is will add in map but during next iteration it will throw error.
            }
        }

        System.out.println(map);
    }
}

/* using HashMap
Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1597)
	at java.base/java.util.HashMap$EntryIterator.next(HashMap.java:1630)
	at java.base/java.util.HashMap$EntryIterator.next(HashMap.java:1628)
	at com.harshit1108.ConcurrentHashMapExceptionCase.main(ConcurrentHashMapExceptionCase.java:19)*/
