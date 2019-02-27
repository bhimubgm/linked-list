package com.test;

import java.util.Arrays;

public class Sample2 {
  public static void main(String[] args) {
    printData(Integer.valueOf(args[0]));
  }

  private static void printData(Integer n) {
    if(n > 0) {
      int size = n % 2 == 0 ? n + 1 : n;
      int mid = size / 2;
      
      int[][] data = new int[n + 1][size];
      for (int i = 0; i < data.length; i++) {
        Arrays.fill(data[i], n);
        
        if( i > 0)
          data[i][mid] = i;
      }

      for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[i].length; j++) {
          System.out.print(data[i][j]);
        }
        System.out.println();
      }
    }
  }
}
