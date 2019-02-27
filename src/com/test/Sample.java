package com.test;

public class Sample {
  public static void main(String[] args) {
    printData(Integer.valueOf(args[0]));
  }

  private static void printData(Integer n) {
    if(n > 0) {
      int[][] data = new int[n][n];
      int head = 0, tail = n-1;
      int val = 1;
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          if(i % 2 == 0){
            data[head][j] = val++;
          } else {
            data[tail][j] = val++;
          }
        }
        
        if(i % 2 == 0){
          head++;
        } else {
          tail--;
        }
      }
      
      for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[i].length; j++) {
          System.out.print(data[i][j] 
              + (j == data[i].length - 1 ? "\n" : "*"));
        }
      }
    }
  }
}
