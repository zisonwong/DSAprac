/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author taruc
 */
public class ArraySet<T> implements SetInterface<T> {
    private int numberOfEntries;
    private T[] array;
    private final static int DEFAULT_CAPACITY = 100;

    public ArraySet() {
        numberOfEntries = 0;
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public String toString() {
        String str = "{";
        for (int i = 0; i < numberOfEntries; i++) {
            str += array[i] + ",";
        }
        str += "\b\b}";
        return str;
    }

    private int indexOf(T anElement){
        for (int i = 0; i < numberOfEntries; i++) {
            if (array[i].equals(anElement)) {
                return i; //anElement exists in the set
            }
        }
        return -1;//an element does not exist in the set
    }
    
    @Override
    public boolean add(T newElement) {
        int index = indexOf(newElement);
        if (index == -1) { //newelement does not exist in the set
            array[numberOfEntries++] = newElement;
            return true;
        }
        return false; // new element already exists in the set
    }

    @Override
    public boolean remove(T anElement) {
        int index = indexOf(anElement);
        if (index != -1) { //an Element exists in the set
        for (int j = index; j < numberOfEntries -1; j++) {
            array[j] = array[j+1];
        }
        numberOfEntries--;
        return true;
        }
        return false;
    }

    @Override
    public boolean checSubset(SetInterface anotherSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void union(SetInterface anotherSet) {
        ArraySet<T> givenSet = (ArraySet<T>) anotherSet;
        for (int i = 0; i < givenSet.numberOfEntries; i++) {
            this.add(givenSet.array[i]);
        }
    }

    @Override
    public SetInterface intersection(SetInterface anotherSet) {
        SetInterface<T> resultSet = new ArraySet<>();
        ArraySet<T> givenSet = (ArraySet<T>) anotherSet;
        for(int i=0;i < givenSet.numberOfEntries; i++){
            T currentElement = givenSet.array[i];
            int index = indexOf(currentElement);
            if(index!= -1){ //given set's current element is in this set
                resultSet.add(currentElement);
            }
        }
        return resultSet;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
