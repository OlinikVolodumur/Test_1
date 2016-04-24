/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_1_desktop;
import javax.swing.table.AbstractTableModel;
import test_1.*;
/**
 *
 * @author Dell
 */
public class MyTableModel extends  AbstractTableModel {
    
 TwoArray TwoArray = new TwoArray();
         int[][] MyTwoArray = TwoArray.BuildArray();

  public int[][] values = MyTwoArray;
  
  public int getRowCount() {
    return 8;
  }

  public int getColumnCount() {
    return 5;
  }

  public Object getValueAt(int row, int column) {
    return values[row][column];
  }
}
