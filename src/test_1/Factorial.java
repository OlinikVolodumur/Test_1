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
public class Factorial {
    private int FactCalc(int fbn, int i) {
        return fbn*i;
    }
    
    public int ForCalc(int n) {
    int fbn=1;
        for (int i=2;i<=n;i++)
            fbn = FactCalc(fbn,i);
        
        return fbn;
    }
    
     public int WhileCalc(int n) {
    int fbn=1;
    int i=2;
    
    while (i<=n) {
        fbn = FactCalc(fbn,i);
        i++;
    }
        return fbn;
    }
}
