package com.test.linkedlist;

/**
 * Remove node(s) from linked list
 *  - N nodes with starting from
 *  - From index is exclusive.
 * 
 * Following example adds a number passed to 999.
 * 
 * Example 1:
 * input list: [1][2][3][4][5]
 * starting from: 1
 * Remove node: 2
 * 
 * 
 * Output list: [1][4][5]
 * 
 * Example 2:
 * input list: [1][2][3][4][5]
 * starting from: 0
 * Remove node: 2
 * 
 * Output list: [3][4][5]
 *  
 * Example 3:
 * input list: [1][2][3][4][5]
 * starting from: 5
 * Remove node: 2
 * 
 * Output list: [1][2][3][4][5]
 */
public class LinkedListDeletion {

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
    head = listUtil.deleteNodes(head, 5, 2);

    System.out.println("Resulting list: " + head);
  }
}
