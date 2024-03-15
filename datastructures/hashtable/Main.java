package datastructures.hashtable;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static  boolean itemInCommon(int[] array1, int[] array2){
        Map<Integer, Boolean> myMap = new HashMap<>();

        for(int i : array1){
            myMap.put(i, true);
        }

        for(int j : array2){
            if(myMap.get(j) != null){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();

        System.out.println("Lumber:");
        System.out.println( myHashTable.get("lumber") );

        System.out.println("\nBolts:");
        System.out.println( myHashTable.get("bolts") );

        System.out.println("\nAll of the keys: " + myHashTable.keys());

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println("\nItem in common in the arrays: " + itemInCommon(array1, array2));

    }
}
