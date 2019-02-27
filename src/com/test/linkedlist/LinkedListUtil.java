package com.test.linkedlist;

import java.util.Objects;

public class LinkedListUtil<T> {

  /**
   * Add a integer digit between 0 to 9.
   */
  public Integer addDigit(Integer digit, Node<Integer> head) {

    Integer carry = 0;
    if(digit >= 0 && digit <= 9){
      // next is null if it is LSB
      if(head.next != null) {
        // Move towards LSB bit.
        head.data = head.data + addDigit(digit, head.next);
      } else {
        // We reached LSB
        head.data = head.data + digit;
      }
      // If carry forward digit is present, calculate it and return it.
      if(head.data > 9){
        carry = head.data / 10;
        head.data = head.data % 10;
      }
    }
    return carry;
  }

  /**
   * Delete theseMany nodes from list starting from fromHere index.
   * fromHere is exclusive.
   */
  public Node<T> deleteNodes(Node<T> head, int fromHere, int theseMany) {
    
    Node<T> returNode = head;
    if(Objects.nonNull(head)){
      // Make sure fromHere and theseMany are non negative values
      fromHere = (fromHere < 0) ? 0 : fromHere;
      theseMany = (theseMany < 0) ? 0 : theseMany;
      
      // check fromHere is not more than nodes count.
      if(fromHere <= head.getFurtherSize()){
        // Get node from where the nodes to be removed.
        Node<T> fromNode = this.getNthNode(head, fromHere);
        
        if(theseMany + 1 < fromNode.getFurtherSize()){
          Node<T> toNode = this.getNthNode(fromNode.next, theseMany);
          fromNode.next = toNode.next;
          if(fromHere == 0)
            returNode = toNode;
        } else {
          fromNode.next = null;
        }
      }
    }
    return returNode;
  }

  /**
   * Get the nod at fromHere index.
   */
  private Node<T> getNthNode(Node<T> head, int fromHere) {

    if(fromHere > 1 && Objects.nonNull(head))
      return this.getNthNode(head.next, --fromHere);
    return head;
  }

  public Node<Integer> oddEvenGroup(Node<Integer> head, boolean oddFirst) {
    if(Objects.nonNull(head)){
      Node<Integer> current = head;
      Node<Integer> evens = null;
      Node<Integer> odds = null;
      while(Objects.nonNull(current)){
        if(current.data.intValue() % 2 == 0){
          evens = current;
        }
      }
    }
    return head;
  }
}
