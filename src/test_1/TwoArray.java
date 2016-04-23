/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_1;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 *
 * @author Dell
 */
public class TwoArray {
    public int[][] BuildArray() {
    int[][] MyAr = new int[8][5];
    
    for (int i=0;i<8;i++) {
        for (int j=0;j<5;j++)
         MyAr[i][j]= (int)(Math.random()*89+10) ;
        }
     return MyAr;   
    }
    
}
