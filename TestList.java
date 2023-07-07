/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

/**
 *
 * @author taruc
 */

import java.util.ArrayList;

public class TestList {
    
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("apple");
        groceryList.add("banana");
        groceryList.add("coconut");
        groceryList.add("durian");
        
        displayList(groceryList);
        String removedItem = groceryList.remove(1);
        System.out.println("\nremoved item:" + removedItem);
        System.out.println("Grocery List updated");
        displayList(groceryList);
    }

    public static void displayList(ArrayList<String> groceryList) {
        System.out.println("\nGroceryList:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
        System.out.println("total items:" + groceryList.size());
    }
}
