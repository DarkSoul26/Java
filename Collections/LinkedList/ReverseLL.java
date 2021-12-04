// Next question will test how comfortable you are with Linked Lists.
// The problem statement is simple "Reverse a singly linked list".

/*
 For your reference:

 SinglyLinkedListNode {
     int data;
   SinglyLinkedListNode next;
 }
To create a new node use below constructor
public SinglyLinkedListNode(int nodeData)
*/

static SinglyLinkedListNode reverseLinkedList(SinglyLinkedListNode head) {

    //write your code here
      // SinglyLinkedListNode temp = head;
      SinglyLinkedListNode prev = null;
      
      while(head!=null){
        SinglyLinkedListNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
      }
      // temp = prev;
      
      return prev;
    }
    