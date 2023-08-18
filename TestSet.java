/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author taruc
 */
import adt.*;

public class TestSet {
    public static void main(String[] args) {
        SetInterface<Integer> setA = new ArraySet<>();
        System.out.println("Add 10:" + setA.add(10));
        System.out.println("Add 20:" + setA.add(20));
        System.out.println("Add 30:" + setA.add(30));
        System.out.println("Add 40:" + setA.add(40));
        System.out.println("Add 50:" + setA.add(50));
        System.out.println("Add 10:" + setA.add(10));
        System.out.println("Add 30:" + setA.add(30));
        System.out.println("Add 50:" + setA.add(50));
        System.out.println("\nsetA:" + setA);
        
        System.out.println("\n Remove 30:" + setA.remove(30));
        System.out.println("setA : " + setA);
        System.out.println("\n Remove 10:" + setA.remove(10));
        System.out.println("setA : " + setA);
        System.out.println("\n Remove 50:" + setA.remove(50));
        System.out.println("setA : " + setA);
        System.out.println("\n Remove 30:" + setA.remove(30));
        System.out.println("setA : " + setA);
        
        SetInterface<Integer> setB = new ArraySet<>();
        setB.add(20);
        setB.add(35);
        setB.add(40);
        setB.add(60);
        System.out.println("\nsetB:" + setB);
        
        SetInterface<Integer> setC = new ArraySet<>();
        setC.add(20);
        setC.add(30);
        setC.add(45);
        System.out.println("\nsetC:" + setC);
        
        setB.union(setC);
        System.out.println("\nAfter union, setB:" + setB);

        SetInterface<Integer> setD = setA.intersection(setB);
        System.out.println("setD:" + setD);
    }
}
