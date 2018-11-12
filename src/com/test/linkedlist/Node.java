package com.test.linkedlist;

import java.util.Objects;

public class Node<T> {
  public T data;
  public Node<T> next;
  
  public Node(T data, Node<T> prev, Node<T> next) {
    super();
    this.data = data;
    this.next = next;
    if(Objects.nonNull(prev))
      prev.next = this;
  }

  public int getFurtherSize(){
    int size = 0;
    Node<T> node = this;
    while(Objects.nonNull(node)){
      size++;
      node = (node.next != this) ? node.next : null;
    }
    return size;
  }
  
  @Override
  public String toString() {
    StringBuilder output = new StringBuilder();
    Node<T> node = this;
    while(Objects.nonNull(node)){
      output.append("[").append(node.data.toString()).append("]");
      node = (node.next != this) ? node.next : null;
    }
    return output.toString();
  }
}
