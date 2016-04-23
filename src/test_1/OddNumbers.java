/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_1;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class OddNumbers {

   
public ArrayList<Integer> ForCalc () {    
    ArrayList<Integer> result = new ArrayList();
    
    for (int i=1;i<=99;i++)    {
    if (i%2!=0) result.add(i);
    }
    
return result;    
}


public ArrayList<Integer> WhileCalc () {    
    ArrayList<Integer> result = new ArrayList();
    int i=1;
    while (i<=99)    {
    if (i%2!=0) result.add(i);
    i++;
    }
    
return result;    
}
    
}
