package com.bhimubgm.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
 
  public static void main(String[] args) {
    System.out.println(findLongestCommonPrefix("findLongestCommonPrefix", "findLongestCommonSuffix"));
  }
  
  public static String findLongestCommonPrefix(String s1, String s2) {
    List<Character> characters1 = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    List<Character> characters2 = s2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    System.out.println(characters1);
    System.out.println(characters2);
    if(!characters1.retainAll(characters2))
      return "NULL";
    return characters1.toString();
  }
}
