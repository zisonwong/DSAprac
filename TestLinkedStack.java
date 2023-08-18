/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import adt.LinkedStack;
import adt.StackInterface;

/**
 *
 * @author taruc
 */
public class TestLinkedStack {
    public static void main(String[] args) {
        StackInterface<Integer> s = new LinkedStack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("\nStack contains:\n " + s);
        
        System.out.println("stack is empty?" + s.isEmpty());
        System.out.println("\nPop an element:" + s.pop());
        System.out.println("\nPop an element:"+ s.pop());
        System.out.println("\nPop an element:"+  s.pop());
        System.out.println("\nPop an element:"+ s.pop());
        System.out.println("stack is empty?"+ s.isEmpty());
        System.out.println("\nPop an element:"+ s.pop());
    }
}
