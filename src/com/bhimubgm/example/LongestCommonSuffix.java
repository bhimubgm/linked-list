package com.bhimubgm.example;

public class LongestCommonSuffix {
 
  public static void main(String[] args) {
    System.out.println(findLongestCommonSuffix("tyhtgxaerge", "tyhtgaerge"));
  }
  
  public static String findLongestCommonSuffix(String s1, String s2) {
    int m = s1.length();
    int n = s2.length();
        
    // Store length of longest suffix
    int l = 0;
    
    while(m > 0 && n > 0){
      if(s1.charAt(--m) == s2.charAt(--n)){
        l++;
      } else {
        break;
      }
    }
    
    // There is no common suffix
    if(l == 0){
      return "NULL";
    }
    
    // Stores longest suffix
    return s1.substring(s1.length() - l, s1.length());
  }
}
