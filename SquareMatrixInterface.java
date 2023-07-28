/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author taruc
 */
public interface SquareMatrixInterface {
    void makeEmpty(int m);
    void storeValue(int i,int j,int value);
    SquareMatrixInterface add(SquareMatrixInterface m);
}
