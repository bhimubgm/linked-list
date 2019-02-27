package com.test.linkedlist;

/**
 * Rearrange linked list in such a way that the nodes having odd number are together and even number are together.
 * 
 * Example 1:
 * input list: [1][2][3][4][5]
 * odd first: true
 * 
 * Output list: [1][3][5][2][4]
 * 
 * Example 2:
 * input list: [3][1][4][5][2]
 * odd first: true
 * 
 * Output list: [3][1][5][4][2]
 */
public class LinkedListOddEvenGrouping {

  public static void main(String[] args) {
    // create list with 5 nodes
    Node<Integer> head = new Node<>(1, null, 
        new Node<>(2, null, 
            new Node<>(3, null, 
                new Node<>(4, null, 
                    new Node<>(5, null, null)))));
    
    System.out.println("Initial list: " + head);

    // Remove 2 node(s) from starting after 3rd node in linked list
    LinkedListUtil<Integer> listUtil = new LinkedListUtil<>();
    head = listUtil.oddEvenGroup(head, true);

    System.out.println("Resulting list: " + head);
  }
}
