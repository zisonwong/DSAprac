/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package adt;

/**
 *
 * @author taruc
 */

import java.util.Iterator;
public interface SetInterface<T>{
    //complete this interface

Iterator<T> getIterator;
    
    boolean add(T newElement);
    
    boolean remove(T anElement);
    
    boolean checSubset(SetInterface anotherSet);
    
    void union(SetInterface anotherSet);
    
    SetInterface intersection(SetInterface anotherSet);
    
    boolean isEmpty();
}
