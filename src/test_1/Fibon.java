/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_1;

/**
 *
 * @author Dell
 */
public class Fibon {
    public int[] calc() {
    int[] ArrayFibo = new int[20];
    
    ArrayFibo[1] = 1; ArrayFibo[2] = 1;
            
    for (int i=3;i<20;i++) {
    ArrayFibo[i] = ArrayFibo[i-1]+ArrayFibo[i-2];
    }
    
    return ArrayFibo;
    }
    
}
