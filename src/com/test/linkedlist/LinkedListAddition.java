package com.test.linkedlist;

/**
 * Add a single digit number to a number represented as linked list
 * 
 * Following example adds a number passed to 999.
 * 
 * Example 1:
 * input list: [9][9][9]
 * number to add: 9
 * 
 * Output list: [1][0][0][8]
 * 
 * Example 2:
 * input list: [1][9][9]
 * number to add: 9
 * 
 * Output list: [2][0][8]
 */
public class LinkedListAddition {

  public static void main(String[] args) {
    
    // create list to represent 199
    Node<Integer> head = new Node<>(1, null, 
        new Node<>(9, null, 
            new Node<>(9, null, null)));
    
    System.out.println("Initial list: " + head);
    
    // Add a digit to number represent by list
    head = addDigit(9, head);
    
    System.out.println("Resulting list: " + head);
  }
  
  public static Node<Integer> addDigit(Integer digit, Node<Integer> head) {
   
    LinkedListUtil listUtil = new LinkedListUtil();
    
    // This method adds the give digit to the LSB of list and return carriage if any.
    Integer carry = listUtil.addDigit(digit, head);
    
    // if there is carriage, create new node ad make it head because this represents MSB.
    if(carry > 0) {
      head = new Node<>(carry, null, head);
    }
    return head;
  }
}
