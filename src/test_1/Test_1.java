/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */



public class Test_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*
        //1
         OddNumbers OddNumbersFor = new OddNumbers();
         ArrayList<Integer> NumbersFor = OddNumbersFor.ForCalc();
         
         System.out.println("For:");
         
       for (Integer number:NumbersFor)
           System.out.println(number);
       
       
       OddNumbers OddNumbersWhile = new OddNumbers();
         ArrayList<Integer> NumbersWhile = OddNumbersWhile.WhileCalc();
         
         System.out.println("While:");
         int i=0;
           while (i<NumbersWhile.size()) {
           System.out.println(NumbersWhile.get(i));
           i++;
         }
         */
       //2
       System.out.println();
       Factorial Factorial = new Factorial();
       
       Scanner input = new Scanner(System.in);
       System.out.println("Input number n");
       
          
       
     try {
         int n = input.nextInt();
                  
           int NFactorialFor = Factorial.ForCalc(n);
           System.out.println("NFactorialFor calculation For = " + NFactorialFor);
           
           int NFactorialWhile = Factorial.WhileCalc(n);
           System.out.println("NFactorialFor calculation While = " +NFactorialWhile);
        }
       catch (InputMismatchException e) {
           System.out.println("Type n is not int");
       }
       
       
       /*
       //4
       
       OddNumbers OddNumbers = new OddNumbers();
       ArrayList<Integer> numbers = OddNumbersWhile.WhileCalc();
       
       for (Integer number:numbers)
       System.out.print(number+" ");
       
       System.out.println();
       
       for (int j = numbers.size()-1; j>=0;j--)
       System.out.print(numbers.get(j)+" ");
       
       
       //5
       Fibon Fibon = new Fibon();
       int[] ArrayFibon = Fibon.calc();
       
       for (int number:ArrayFibon)
       System.out.println(number);
       */
       /*
       //6
       TwoArray TwoArray = new TwoArray();
       int[][] MyTwoArray = new int[8][5];
       MyTwoArray = TwoArray.BuildArray();
       
       for (int i=0;i<8;i++) {
       for (int j=0;j<5;j++)
       System.out.print(MyTwoArray[i][j]+" ");
       
       System.out.println();
       }
       
       
       */     
}
    
 
    
    
   
}

