// After solving quite a few problems of singly linked list, you must be quite 
// confident with it. Let's proceed ahead to solve a question from Doubly Linked List.
// The question is simple but I am not sure of the simplicity of the solution though.
// You are given a doubly-linked list of size N and an integer K, your task is 
// to rotate the doubly linked list anti-clockwise by K positions.

import java.io.*;
import java.util.*;
class Main {
static class SinglyLinkedListNode {
public int data;
public SinglyLinkedListNode next;
public SinglyLinkedListNode prev;
public SinglyLinkedListNode(int nodeData) {
    this.data = nodeData;
    this.next = null;
    this.prev = null;
}
}
static class SinglyLinkedList {
public SinglyLinkedListNode head;
public SinglyLinkedListNode tail;
public SinglyLinkedList() {
    this.head = null;
    this.tail = null;
}
public void insertNode(int nodeData) {
    SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
    if (this.head == null) {
        this.head = node;
        this.tail=node;
        this.head.next=null;
        this.head.prev=null;
        this.tail.next=null;
        this.tail.prev=null;
    } else {
        node.prev=this.tail;
        this.tail.next=node;
        this.tail=node;
        this.tail.next=null;
    }
}
}
static void printLinkedList(SinglyLinkedListNode head)
{
SinglyLinkedListNode temp=head;
while(temp!=null)
{
    System.out.print(temp.data+" ");
    temp=temp.next;
}
System.out.println();
}

// Complete the rotateDoublyList function below.

/*
For your reference:
SinglyLinkedListNode {
int data;
SinglyLinkedListNode next;
SinglyLinkedListNode prev;
}
To create a new node use below constructor
public SinglyLinkedListNode(int nodeData)
*/

static SinglyLinkedListNode rotateDoublyList(SinglyLinkedListNode head,int k) {

// write your code here
  SinglyLinkedListNode temp = head;
  if(head.next == null)
    return head;
  while(k--!=1){
    temp = temp.next;
    // if(temp==null)
    //   return head;
  }
  if(temp.next == null)
    return head;
  SinglyLinkedListNode merge = temp.next;
  merge.prev = null;
  SinglyLinkedListNode ans = temp.next;
  temp.next = null;
  while(merge.next!=null){
    merge = merge.next;
  }
  merge.next = head;
  head.prev = merge;
  return ans;
}


private static final Scanner scanner = new Scanner(System.in);
public static void main(String[] args) throws IOException {
int testCases = scanner.nextInt();
while (testCases-- > 0) {
SinglyLinkedList llist = new SinglyLinkedList();
int llistCount = scanner.nextInt();
int k = scanner.nextInt();
for (int i = 0; i < llistCount; i++) {
    int llistItem = scanner.nextInt();
    llist.insertNode(llistItem);
}
printLinkedList(rotateDoublyList(llist.head,k));
}
scanner.close();
}
}