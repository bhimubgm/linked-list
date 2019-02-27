package com.bhimubgm.example;

public class InserStartAndHyphen {
  
  public static void main(String[] args) {
    System.out.println(inserStartAndHyphen("-2397492834092"));
  }

  public static String inserStartAndHyphen(String s){

    // Stores resulting string.
    StringBuilder sb = new StringBuilder();
    
    // Start with the first character
    sb.append(s.charAt(0));
    for(int i = 0; i < s.length() - 1; i++){
      int v1 = Integer.parseInt("" + s.charAt(i));
      int v2 = Integer.parseInt("" + s.charAt(i + 1));

      // Check if both or even numbers then appen '*'
      if(v1 != 0 && v2 != 0 && v1 % 2 == 0 && v2 % 2 == 0) {
        sb.append('*');
      } 
      // Check if both are odd numbers then append '-'
      else if(v1 % 2 != 0 && v2 % 2 != 0){
        sb.append('-');
      }
      //put next character in result.
      sb.append(s.charAt(i + 1));
    }
    return sb.toString();
  }
}
