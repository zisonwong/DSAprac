/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

/**
 *
 * @author taruc
 */

import adt.*; // import on demand

public class TestArrayList {
    public static void main(String[] args) {
        ListInterface<Integer> aList = new ArrayList<>();
        for (int pos = 1; pos <= 10; pos++) {
            int value = pos * 10;
            System.out.println("Adding" + value);
            aList.add(value);
        }
        System.out.println("\naList:\n" + aList);
    
    ListInterface<Integer> bList = new ArrayList<>();
        for (int pos = 1; pos <= 10; pos++) {
            int value = pos * 10;
            System.out.println("Adding" + value);
            bList.add(pos,value);
        }
        System.out.println("\naList:\n" + bList);
    }
}
